package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.LexerNoViableAltException;

/**
 * Sample execution command 
 * cd ~/DP_LAB1
 * cat /tmp/lab1_input.cnf | mvn exec:java -Dexec.args="-o /tmp/output.cnf"
 * cd ~/minisat
 * ./build/release/bin/minisat /tmp/output.cnf
 */
public class App
{
    public static void main( String[] args )
    {

        if(args.length != 2) {
            System.err.println("USAGE: mvn exec:java -Dexec.args=\"-o /tmp/output.cnf\"");
            System.err.println("Program reads the formula from input stream");

            System.out.println("Arguments given:" );
            for(String arg : args) {
                System.out.print(" " + arg);
            }
            System.exit(-1);
        }

        String output_file = args[1];

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(output_file))) {
            BailPropositionalLogicLexer lexer = new BailPropositionalLogicLexer(CharStreams.fromStream(System.in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PropositionalLogicParser parser = new PropositionalLogicParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());
            ParseTree tree = parser.formula();
            
            CNFBuilder builder = new CNFBuilder();
            FormulaNode rootNode = builder.visit(tree);

            writer.write("p cnf " + rootNode.rep + " " + rootNode.clauses.size() + "\n");
            for(String clause : rootNode.clauses) {
                writer.write(clause + "\n");
            }

        } catch(Exception e) {
            System.err.println("Unexpected exception occurred:");
            e.printStackTrace();
        }

    }
}

class InvalidInputException extends RuntimeException {

    public InvalidInputException(Throwable e) {
        super(e);
    }

}

class BailErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw new InvalidInputException(e);
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        throw new InvalidInputException(new InputMismatchException(recognizer));
    }

    @Override
    public void sync(Parser recognizer) {}

}

class BailPropositionalLogicLexer extends PropositionalLogicLexer {

    public BailPropositionalLogicLexer(CharStream input) {super(input); };

    public void recover(LexerNoViableAltException e) {
        throw new InvalidInputException(e);
    }

}

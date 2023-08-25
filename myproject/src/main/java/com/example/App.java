package com.example;

import com.example.GMRLexer;
import com.example.GMRParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // String input = "(a -> b) | (c <-> d & !a)";
        String input = "a | b <-> c & d";
        
        GMRLexer lexer = new GMRLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GMRParser parser = new GMRParser(tokens);
        
        ParseTree tree = parser.expression();
        
        // Print the parse tree (for debugging)
        System.out.println(tree.toStringTree(parser));
    }
}

package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.PropositionalLogicParser.AndContext;
import com.example.PropositionalLogicParser.IffContext;
import com.example.PropositionalLogicParser.ImplyContext;
import com.example.PropositionalLogicParser.NotContext;
import com.example.PropositionalLogicParser.OrContext;
import com.example.PropositionalLogicParser.ParenthesisContext;
import com.example.PropositionalLogicParser.SubformulaContext;
import com.example.PropositionalLogicParser.VariableContext;

public class PropositionalLogicGrammarTest {

    private ParseTree getTree(String input) {

        PropositionalLogicLexer lexer = new PropositionalLogicLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropositionalLogicParser parser = new PropositionalLogicParser(tokens);
        return parser.formula();

    }

    @ParameterizedTest
    @CsvSource(value = {
      "P & Q & R :PQ&R&"
      ,"P -> Q -> R :PQR->->"
      ,"P & Q | R :PQ&R|"
      ,"P | Q & R :PQR&|"
      ,"(A | B) & (C & D | E) & F & G :AB|CD&E|&F&G&"
      ,"a->b | (c <-> d & !a) | a <-> b | c <-> d & !a :abcda!&<->|a|->bc|da!&<-><->"
    }, delimiter = ':')
    public void test_postfix_all(String input, String expected) {
        ParseTree tree = getTree(input);
        PostfixConverter visitor = new PostfixConverter();
        assertEquals(expected, visitor.visit(tree));
    }
    
}

class PostfixConverter extends PropositionalLogicBaseVisitor<String> {

    private StringBuilder concat(List<SubformulaContext> ctxs) {
        StringBuilder stringBuilder = new StringBuilder();
        for(SubformulaContext subCtx : ctxs) {
            stringBuilder.append(visit(subCtx));
        }
        return stringBuilder;
    }

    @Override
    public String visitParenthesis(ParenthesisContext ctx) {
        return visit(ctx.subformula());
    }

    @Override
    public String visitAnd(AndContext ctx) {
        return concat(ctx.subformula()).append("&").toString();
    }

    @Override
    public String visitIff(IffContext ctx) {
        return concat(ctx.subformula()).append("<->").toString();
    }

    @Override
    public String visitImply(ImplyContext ctx) {
        return concat(ctx.subformula()).append("->").toString();
    }

    @Override
    public String visitNot(NotContext ctx) {
        return concat(Arrays.asList(ctx.subformula())).append("!").toString();
    }

    @Override
    public String visitOr(OrContext ctx) {
        return concat(ctx.subformula()).append("|").toString();
    }

    @Override
    public String visitVariable(VariableContext ctx) {
        return ctx.getText();
    }

}
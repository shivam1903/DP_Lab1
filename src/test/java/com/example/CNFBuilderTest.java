package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

public class CNFBuilderTest {

    private ParseTree getTree(String input) {

        PropositionalLogicLexer lexer = new PropositionalLogicLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropositionalLogicParser parser = new PropositionalLogicParser(tokens);
        return parser.formula();

    }

    @Test
    public void test_and() {
        ParseTree tree = getTree("P & Q");
        CNFBuilder builder = new CNFBuilder();
        FormulaNode res = builder.visit(tree);
        assertEquals(4, res.clauses.size());

        for(String clause : res.clauses) {
            System.out.println(clause);
        }

        assertTrue(res.clauses.contains("-3 1 0"));
        assertTrue(res.clauses.contains("-3 2 0"));
        assertTrue(res.clauses.contains("-1 -2 3 0"));
        assertTrue(res.clauses.contains("3 0"));

    }

    @Test
    public void test_not() {
        ParseTree tree = getTree("!P");
        CNFBuilder builder = new CNFBuilder();
        FormulaNode res = builder.visit(tree);
        assertEquals(3, res.clauses.size());

        assertTrue(res.clauses.contains("-2 -1 0"));
        assertTrue(res.clauses.contains("2 1 0"));
        assertTrue(res.clauses.contains("2 0"));
    }

    @Test
    public void test_or() {
        ParseTree tree = getTree("P | Q");
        CNFBuilder builder = new CNFBuilder();
        FormulaNode res = builder.visit(tree);
        assertEquals(4, res.clauses.size());

        assertTrue(res.clauses.contains("-3 1 2 0"));
        assertTrue(res.clauses.contains("-1 3 0"));
        assertTrue(res.clauses.contains("-2 3 0"));
        assertTrue(res.clauses.contains("3 0"));
    }


    @Test
    public void test_imply() {
        ParseTree tree = getTree("P -> Q");
        CNFBuilder builder = new CNFBuilder();
        FormulaNode res = builder.visit(tree);
        assertEquals(4, res.clauses.size());

        assertTrue(res.clauses.contains("-3 -1 2 0"));
        assertTrue(res.clauses.contains("1 3 0"));
        assertTrue(res.clauses.contains("-2 3 0"));
        assertTrue(res.clauses.contains("3 0"));
    }

    @Test
    public void test_iff() {
        ParseTree tree = getTree("P <-> Q");
        CNFBuilder builder = new CNFBuilder();
        FormulaNode res = builder.visit(tree);
        assertEquals(5, res.clauses.size());

        assertTrue(res.clauses.contains("-3 -1 2 0"));
        assertTrue(res.clauses.contains("-3 1 -2 0"));
        assertTrue(res.clauses.contains("3 -1 -2 0"));
        assertTrue(res.clauses.contains("3 1 2 0"));
        assertTrue(res.clauses.contains("3 0"));
    }

    @Test public void test_combination() {
        ParseTree tree = getTree(" (a & b) | (c & d)");
        CNFBuilder builder = new CNFBuilder();
        FormulaNode res = builder.visit(tree);
        assertEquals(10, res.clauses.size());

        
        for(String clause : res.clauses) {
            System.out.println(clause);
        }
    }

}
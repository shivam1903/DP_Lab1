package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.example.PropositionalLogicParser.AndContext;
import com.example.PropositionalLogicParser.FormulaContext;
import com.example.PropositionalLogicParser.IffContext;
import com.example.PropositionalLogicParser.ImplyContext;
import com.example.PropositionalLogicParser.NotContext;
import com.example.PropositionalLogicParser.OrContext;
import com.example.PropositionalLogicParser.ParenthesisContext;
import com.example.PropositionalLogicParser.VariableContext;


public class CNFBuilder extends PropositionalLogicBaseVisitor<FormulaNode> {

    HashMap<String, Integer> variableRep = new HashMap<>();
    int repId = 1;

    private List<String> replaceRepIds(int myrep, int rep1, int rep2, List<String> equivalenceClauses) {
        ArrayList<String> myClauses = new ArrayList<>();
        for(String clause : equivalenceClauses) {
            clause = clause.replaceAll("myrep", Integer.toString(myrep));
            clause = clause.replaceAll("rep1", Integer.toString(rep1));
            clause = clause.replaceAll("rep2", Integer.toString(rep2));
            myClauses.add(clause);
        }
        return myClauses;
    }

    private FormulaNode constructNode(FormulaNode f1, FormulaNode f2, List<String> equivalenceClauses) {

        int myrep = repId++;
        int rep1 = f1.rep;
        int rep2 = f2.rep;

        List<String> myClauses = replaceRepIds(myrep, rep1, rep2, equivalenceClauses);

        myClauses.addAll(f1.clauses);
        myClauses.addAll(f2.clauses);

        return new FormulaNode(myrep, myClauses);
    }

    @Override
    public FormulaNode visitAnd(AndContext ctx) {
        FormulaNode f1 = visit(ctx.subformula(0));
        FormulaNode f2 = visit(ctx.subformula(1));

        ArrayList<String> andClauses = new ArrayList<>();
        andClauses.add("-myrep rep1 0");
        andClauses.add("-myrep rep2 0");
        andClauses.add("-rep1 -rep2 myrep 0");

        return constructNode(f1, f2, andClauses);
    }

    @Override
    public FormulaNode visitFormula(FormulaContext ctx) {
        FormulaNode f1 = visit(ctx.subformula());

        int myRep = f1.rep;
        List<String> myClause = new ArrayList<>();
        myClause.add(Integer.toString(myRep) + " 0");
        myClause.addAll(f1.clauses);

        return new FormulaNode(myRep, myClause);
    }

    @Override
    public FormulaNode visitIff(IffContext ctx) {
        FormulaNode f1 = visit(ctx.subformula(0));
        FormulaNode f2 = visit(ctx.subformula(1));

        ArrayList<String> iffClauses = new ArrayList<>();
        iffClauses.add("-myrep -rep1 rep2 0");
        iffClauses.add("-myrep rep1 -rep2 0");
        iffClauses.add("myrep -rep1 -rep2 0");
        iffClauses.add("myrep rep1 rep2 0");

        return constructNode(f1, f2, iffClauses);
    }

    @Override
    public FormulaNode visitImply(ImplyContext ctx) {
        FormulaNode f1 = visit(ctx.subformula(0));
        FormulaNode f2 = visit(ctx.subformula(1));

        ArrayList<String> implyClauses = new ArrayList<>();
        implyClauses.add("-myrep -rep1 rep2 0");
        implyClauses.add("rep1 myrep 0");
        implyClauses.add("-rep2 myrep 0");


        return constructNode(f1, f2, implyClauses);
    }

    @Override
    public FormulaNode visitNot(NotContext ctx) {
       FormulaNode f1 = visit(ctx.subformula());

       int myrep = repId++;
       int rep1 = f1.rep;

       ArrayList<String> notClauses = new ArrayList<>();
       notClauses.add("-myrep -rep1 0");
       notClauses.add("myrep rep1 0");

       List<String> myClauses = replaceRepIds(myrep, rep1, rep1, notClauses);
       myClauses.addAll(f1.clauses);

       return new FormulaNode(myrep, myClauses);
    }

    @Override
    public FormulaNode visitOr(OrContext ctx) {
        FormulaNode f1 = visit(ctx.subformula(0));
        FormulaNode f2 = visit(ctx.subformula(1));

        ArrayList<String> orClauses = new ArrayList<>();
        orClauses.add("-myrep rep1 rep2 0");
        orClauses.add("-rep1 myrep 0");
        orClauses.add("-rep2 myrep 0");

        return constructNode(f1, f2, orClauses);
    }

    @Override
    public FormulaNode visitParenthesis(ParenthesisContext ctx) {
        return visit(ctx.subformula());
    }

    @Override
    public FormulaNode visitVariable(VariableContext ctx) {
        String var = ctx.getText();
        int rep = -1;
        if(variableRep.containsKey(var)) {
            rep = variableRep.get(var);
        } else {
            rep = repId++;
            variableRep.put(var, rep);
        }
        FormulaNode node = new FormulaNode(rep, Collections.emptyList());
        return node;
    }
    
}

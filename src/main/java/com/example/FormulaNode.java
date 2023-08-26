package com.example;

import java.util.List;

public class FormulaNode {

    List<String> clauses;
    int rep;

    public FormulaNode(int id, List<String> cnfClauses) {
        this.rep = id;
        this.clauses = cnfClauses;
    }

}
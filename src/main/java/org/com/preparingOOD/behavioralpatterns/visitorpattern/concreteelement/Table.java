package org.com.preparingOOD.behavioralpatterns.visitorpattern.concreteelement;

import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentElement;
import org.com.preparingOOD.behavioralpatterns.visitorpattern.DocumentVisitor;

public class Table implements DocumentElement {
    private int rows;

    private  int column;

    public Table(int rows, int column) {
        this.rows = rows;
        this.column = column;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}

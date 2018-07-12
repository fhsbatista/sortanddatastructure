package com.fbatista.EstruturaDados;

public class EmployeeNode {

    private Employee node;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee node) {
        this.node = node;
    }

    public Employee getNode() {
        return node;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public void setNode(Employee node) {
        this.node = node;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return node.toString();
    }
}

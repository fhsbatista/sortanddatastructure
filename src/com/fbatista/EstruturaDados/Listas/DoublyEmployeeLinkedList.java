package com.fbatista.EstruturaDados.Listas;

import com.fbatista.EstruturaDados.Employee;
import com.fbatista.EstruturaDados.EmployeeNode;

public class DoublyEmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;


    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(head==null){
            tail = node;
        } else{
            head.setPrevious(node);
        }

        node.setNext(head);
        node.setPrevious(null);
        head = node;

        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null){
            head = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        node.setNext(null);
        tail = node;

        size++;



    }


    public EmployeeNode removeFromFront(){
        if(isEmpty())
            return null;
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void printList(){
        EmployeeNode current = head;
        while(current != null){
            System.out.println(current.getPrevious() + " <- " +  current + " -> " + current.getNext());
            current = current.getNext();
        }
        System.out.println();
    }



}

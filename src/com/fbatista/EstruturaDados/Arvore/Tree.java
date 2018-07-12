package com.fbatista.EstruturaDados.Arvore;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import static java.lang.Math.floor;
import static java.lang.Math.max;

public class Tree {

    private TreeNode element;
    private Tree leftNode;
    private Tree rightNode;

    public Tree(TreeNode root){
        this.element = root;
        this.leftNode = null;
        this.rightNode = null;
    }

    public Tree(){
        this.element = null;
        this.leftNode = null;
        this.rightNode = null;
    }

    public boolean isEmpty(){
        return element == null;
    }

    public void insert(TreeNode element){
        if(this.isEmpty()){
            this.element = element;
            System.out.println("O elemento " + element.getData() + " foi inserido na raiz");
        } else{
            Tree newTree = new Tree(element);
            if(element.getData() > this.element.getData()){
                if(this.rightNode == null) {
                    this.rightNode = newTree;
                    System.out.println("O elemento " + element.getData() + " foi inserido a DIREITA de " + this.element.getData());
                }
                else {
                    this.rightNode.insert(element);

                }
            } else if(element.getData() < this.element.getData()){
                if(this.leftNode == null) {
                    this.leftNode = newTree;
                    System.out.println("O elemento " + element.getData() + " foi inserido a ESQUERDA de " + this.element.getData());
                }
                else {
                    this.leftNode.insert(element);

                }
            }
        }
    }

    public boolean contains(TreeNode element){

        if(this.isEmpty())
            return false;

        if(this.element.getData() == element.getData()){
            return true;
        } else{
            if(this.element.getData() < element.getData()){

                if(this.rightNode == null)
                    return false;
                else
                    return this.rightNode.contains(element);
            } else if(this.element.getData() > element.getData()){

                if(this.leftNode == null)
                    return false;
                else
                    return this.leftNode.contains(element);
            }

        }
        return false;
    }

    public void printPreOrdem(){

        if(isEmpty())
            return;

        System.out.print(this.element.getData() + " ");
        if(this.leftNode != null){
            this.leftNode.printPreOrdem();
        }
        if(this.rightNode != null){
            this.rightNode.printPreOrdem();
        }

    }

    public void printInOrdem(){

        if(isEmpty())
            return;

        if(this.leftNode != null)
            this.leftNode.printInOrdem();

        System.out.print(this.element.getData() + " ");

        if(this.rightNode != null)
            this.rightNode.printInOrdem();


    }

    public void printPosOrdem(){

        if(isEmpty())
            return;

        if(this.rightNode != null)
            this.rightNode.printPosOrdem();

        if(this.leftNode != null)
            this.leftNode.printPosOrdem();

        System.out.print(this.element.getData() + " ");



    }

    public void printInOrdemInversa(){
        if(isEmpty())
            return;

        if(this.rightNode != null)
            this.rightNode.printInOrdemInversa();

        System.out.print(this.element.getData() + " ");

        if(this.leftNode != null){
            this.leftNode.printInOrdemInversa();
        }
    }

    public static int height(Tree root){

        if(root == null)
            return 0;

        int leftHeight = height(root.leftNode);
        int rightHeight = height(root.rightNode);
        return 1 + max(leftHeight,rightHeight);



    }

    private int weightLeft(){

        if(this.leftNode == null)
            return 1;
        else
            return 1 + this.leftNode.weightLeft();


    }

    private int weightRight(){
        if(this.rightNode == null)
            return 1;
        else
            return 1 + this.rightNode.weightRight();
    }

    public int weightRoot(){

        int weigthRoot = 1;
        if(this.leftNode != null)
            weigthRoot += this.leftNode.weightLeft();
        if(this.rightNode != null)
            weigthRoot += this.rightNode.weightRight();

        return weigthRoot;
    }

//    private void printLeft(Tree leftTree){
//        if(leftTree.leftNode != null)
//            printLeft(leftTree.leftNode);
//
//        System.out.print(leftTree.element.getData() + " ");
//    }
//
//    private void printRight(Tree rightTree){
//        if(rightTree.rightNode != null)
//            printRight(rightTree.rightNode);
//
//        System.out.print(rightTree.element.getData() + " ");
//    }

    public void printTopView(){

        if(this.leftNode != null){
            Stack<Integer> leftView = new Stack<>();
            Tree currentTree = this.leftNode;
            while(currentTree != null){
                leftView.push(currentTree.element.getData());
                currentTree = currentTree.leftNode;
            }
            while(!leftView.isEmpty()){
                System.out.print(leftView.pop() + " ");
            }
        }



       System.out.print(this.element.getData() + " ");

       if(this.rightNode != null){
           Tree currentTree = this.rightNode;
           while(currentTree != null) {
               System.out.print(currentTree.element.getData() + " ");
               currentTree = currentTree.rightNode;
           }

       }


    }





}

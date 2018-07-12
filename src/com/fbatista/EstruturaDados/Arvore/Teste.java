package com.fbatista.EstruturaDados.Arvore;

public class Teste {

    public static void main(String[] args){


        Tree tree = new Tree();
        tree.insert(new TreeNode(10));
        tree.insert(new TreeNode(5));
        tree.insert(new TreeNode(1));
        tree.insert(new TreeNode(8));
        tree.insert(new TreeNode(15));
        tree.insert(new TreeNode(12));
        tree.insert(new TreeNode(18));
        tree.insert(new TreeNode(0));
        tree.insert(new TreeNode(2));
        tree.insert(new TreeNode(11));
        tree.insert(new TreeNode(17));
        tree.insert(new TreeNode(19));
        tree.insert(new TreeNode(16));
        System.out.println("O elemento 5 " + (tree.contains(new TreeNode(5))?  " existe" : " Nao existe"));
        System.out.println("O elemento 10 " + (tree.contains(new TreeNode(10))?  " existe" : " Nao existe"));
        System.out.println("O elemento 55 " + (tree.contains(new TreeNode(55))?  " existe" : " Nao existe"));
        tree.printPreOrdem();
        System.out.println(" ");
        tree.printInOrdem();
        System.out.println(" ");
        tree.printPosOrdem();
        System.out.println(" ");
        tree.printInOrdemInversa();
        System.out.println();
        System.out.print("A altura da arvore e: " + Tree.height(tree));
        System.out.println();
        System.out.print("A largura da arvore e: " + tree.weightRoot());
        System.out.println();
        System.out.println("O top view  da arvore e: ");
        tree.printTopView();





    }


}

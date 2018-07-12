package com.fbatista.EstruturaDados.Listas;

import com.fbatista.EstruturaDados.Employee;

public class LinkedListTest {

    public static void main(String[] args){

        Employee fernando = new Employee("Fernando", "Batista", 23);
        Employee mario = new Employee("Mario", "Broz", 23);
        Employee messi = new Employee("Lionel", "Messi", 23);
        Employee goku = new Employee("Goku", "Kakaroto", 23);



        EmployeeLinkedList list = new EmployeeLinkedList();



        list.addToFront(fernando);
        list.addToFront(mario);
        list.addToFront(messi);
        list.addToFront(goku);

        list.printList();

        System.out.println(list.isEmpty());

        list.removeFromFront();

        list.printList();




    }



}

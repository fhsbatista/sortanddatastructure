package com.fbatista.EstruturaDados.Listas;

import com.fbatista.EstruturaDados.Employee;

public class DoublyLinkedListTest {


    public static void main(String[] args){


        Employee fernando = new Employee("Fernando", "Batista", 23);
        Employee mario = new Employee("Mario", "Broz", 23);
        Employee messi = new Employee("Lionel", "Messi", 23);
        Employee goku = new Employee("Goku", "Kakaroto", 23);


        DoublyEmployeeLinkedList list = new DoublyEmployeeLinkedList();
        list.addToEnd(fernando);
        list.addToEnd(mario);
        list.addToEnd(messi);

        list.printList();

        list.addToEnd(goku);


        list.printList();







    }


}

package com.fbatista.EstruturaDados.Listas;

import com.fbatista.EstruturaDados.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJAVAAPITest {


    public static void main(String[] args){


        Employee fernando = new Employee("Fernando", "Batista", 23);
        Employee mario = new Employee("Mario", "Broz", 23);
        Employee messi = new Employee("Lionel", "Messi", 23);
        Employee goku = new Employee("Goku", "Kakaroto", 23);


        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(fernando);
        list.addFirst(mario);
        list.addFirst(messi);
        list.addFirst(goku);


        for(Employee employee : list){
            System.out.println(employee);
        }

        list.removeFirst();
        System.out.println();


        for(Employee employee : list){
            System.out.println(employee);
        }

        list.remove();
        list.remove(0);


        for(Employee employee : list){
            System.out.println(employee);
        }







    }


}

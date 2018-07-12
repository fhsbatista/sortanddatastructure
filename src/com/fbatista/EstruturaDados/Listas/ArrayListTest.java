package com.fbatista.EstruturaDados.Listas;

import com.fbatista.EstruturaDados.Employee;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

    public static void main(String[] args){

        List<Employee> list = new ArrayList<>(2);
        list.add(new Employee("Jane", "JONES", 33));
        list.add(new Employee("John", "DOE", 23));
        list.add(new Employee("Lice", "SMITH", 28));
        list.add(new Employee("Simon", "WILSON", 28));

        list.forEach(employee -> System.out.println(employee));

        list.set(0, new Employee("Fernando", "Batista", 22));

        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.size());
        list.add(3, new Employee("Tarzan", "Larara", 33));
        list.forEach(employee -> System.out.println(employee));
        System.out.println(list.size());


        list.remove(3);
        list.forEach(employee -> System.out.println(employee));





    }


}

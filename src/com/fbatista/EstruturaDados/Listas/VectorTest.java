package com.fbatista.EstruturaDados.Listas;

import com.fbatista.EstruturaDados.Employee;

import java.util.List;
import java.util.Vector;

public class VectorTest {


    public static void main(String[] args){


        List<Employee> list = new Vector<>();

        list.add(new Employee("Fernando", "Batista", 22));



    }


}

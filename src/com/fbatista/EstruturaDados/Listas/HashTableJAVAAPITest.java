package com.fbatista.EstruturaDados.Listas;

import com.fbatista.EstruturaDados.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashTableJAVAAPITest {

    public static void main(String[] args){


        Map<String, Employee> map = new HashMap<>();


        Employee fernando = new Employee("Fernando", "Batista", 23);
        Employee mario = new Employee("Mario", "Broz", 23);
        Employee messi = new Employee("Lionel", "Messi", 23);
        Employee goku = new Employee("Goku", "Kakaroto", 23);

        map.put("Batista", fernando);
        map.put("Broz", mario);
        map.put("Messi", messi);
        map.put("Kakaroto", goku);
        Employee e = map.putIfAbsent("iii", fernando);
        System.out.println("Funcionario nao isnerido: " + e);
        map.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));



    }


}

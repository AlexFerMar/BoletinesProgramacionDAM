package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Integer[] numbers={8,9,12,45,67,8,3,3,2,1};

        Operacions operacion=new Operacions();

        System.out.println(operacion.getLargest(numbers));
        System.out.println(operacion.getLowest(numbers));
        System.out.println(operacion.searchNumber(numbers,1));
        System.out.println(operacion.deleteNumber(numbers,1));

        System.out.println(operacion.getLowest(numbers));


    }
}

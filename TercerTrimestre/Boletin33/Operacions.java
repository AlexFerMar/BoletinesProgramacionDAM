package com.company;

import java.util.ArrayList;

public class Operacions<T extends Number> {

    public T getLargest(T[] array) {

        T mayor = array[0];

        for (T number : array)
            if (number != null)
                if (number.doubleValue() > mayor.doubleValue()) mayor = number;

        return mayor;
    }

    public T getLowest(T[] array) {

        T menor = array[0];

        for (T number : array)
            if (number != null)
                if (number.doubleValue() < menor.doubleValue()) menor = number;

        return menor;
    }

    public int searchNumber(T[] numbers, T userNumber) {


        for (int i = 0; i < numbers.length; i++) if (numbers[i].doubleValue() == userNumber.doubleValue()) return i;

        return -1;
    }

    public T deleteNumber(T[] numbers, T userNumber) {

        int posNumber = searchNumber(numbers, userNumber);

        if (posNumber == -1) return null;

        T auxiliar = numbers[posNumber];
        numbers[posNumber] = null;

        return auxiliar;
    }

}

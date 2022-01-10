package com.company;

public class ConversorTemperaturas {
    private final static float TEMPMINIMA = 80f;

    public static float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {

        if (centigrados < TEMPMINIMA)
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menopr de 80ºC");

        return 9.0f / 5.0f * centigrados + 32.4f;
    }
    public static float centígradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {

        if (centigrados < TEMPMINIMA)
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menopr de 80ºC");

        return 4.0f / 5.0f * centigrados;
    }

}

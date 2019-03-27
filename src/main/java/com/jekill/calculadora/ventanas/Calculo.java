package com.jekill.calculadora.ventanas;

public class Calculo {
    
    //Manejo Numerico
    public static int redondeo(double num) {
        return (int) (100*(Math.ceil(Math.abs(num/100))));
    }

    public static double dividirDato(double num) {
        return num / (Math.pow(10, 2));
    }

    //L-15
    public static int calculoL15menor100(double alto, double ancho) {
        double calAlto = (dividirDato(alto) * 6 * 0.4 * 6500);
        double calAncho = (dividirDato(ancho) * 4 * 0.4 * 6500);
        double calVidrio = (dividirDato(alto) * dividirDato(ancho) * 10500);

        double precioSR = calAlto + calAncho + calVidrio;

        return (redondeo(precioSR));
    }

    public static int calculoL15mayor100(double alto, double ancho) {
        return (redondeo((dividirDato(alto) * dividirDato(ancho) * 25000)));
    }

    public static void l15Comprobacion100(double alto, double ancho) {
        if (alto * ancho < 10000) {
            calculoL15menor100(alto, ancho);
        } else {
            calculoL15mayor100(alto, ancho);
        }
    }

    //L-20
    public static int calculoL20menor100(double alto, double ancho) {
        double calAlto = (dividirDato(alto) * 6 * 0.48 * 6500);
        double calAncho = (dividirDato(ancho) * 4 * 0.48 * 6500);
        double calVidrio = (dividirDato(alto) * dividirDato(ancho) * 10500);

        double precioSR = calAlto + calAncho + calVidrio;

        return (redondeo(precioSR));
    }

    public static int calculoL20mayor100(double alto, double ancho) {
        return (redondeo(dividirDato(alto) * dividirDato(ancho) * 35000));
    }

    public static void l20Comprobacion100(double alto, double ancho) {
        if (alto * ancho < 10000) {
            calculoL20menor100(alto, ancho);
        } else {
            calculoL20mayor100(alto, ancho);
        }
    }

    //L-25
    public static int calculoL25menor100(double alto, double ancho) {
        double calAlto = (dividirDato(alto) * 6 * 0.68 * 6500);
        double calAncho = (dividirDato(ancho) * 4 * 0.68 * 6500);
        double calVidrio = (dividirDato(alto) * dividirDato(ancho) * 10500);

        double precioSR = calAlto + calAncho + calVidrio;

        return (redondeo(precioSR));
    }

    public static int calculoL25mayor100(double alto, double ancho) {
        return (redondeo(dividirDato(alto) * dividirDato(ancho) * 42000));
    }

    public static void l25Comprobacion100(double alto, double ancho) {
        if (alto * ancho < 10000) {
            calculoL25menor100(alto, ancho);
        } else {
            calculoL25mayor100(alto, ancho);
        }
    }
}
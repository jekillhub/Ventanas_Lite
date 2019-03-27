package Datos;

import java.util.ArrayList;

/**
 *
 * @author jekill
 */
public class Datos {
    
    public int[] ejercicio1;
    public int[] ejercicio2;
    public int[] ejercicio3;
    public int[] ejercicio4;
    
    public Datos(){
        this.ejercicio1 = new int[3];
        this.ejercicio2 = new int[3];
        this.ejercicio3 = new int[3];
        this.ejercicio4 = new int[3];
        llenado();
    }
    
    private void llenado(){
        ejercicio1[0] = 5700; //Ventana 20(alto) x 20(ancho) L-15 menor a 100m2
        ejercicio1[1] = 10200;//Ventana 50x15 L-15 menor a 100m2
        ejercicio1[2] = 11800;//Ventana 25x60 L-15 menor a 100m2
        
        ejercicio2[0] = 36000; //Ventana 120(alto) x 100(ancho) L-15 mayor a 100m2
        ejercicio2[1] = 216000;//Ventana 200x360 L-15 mayor a 100m2
        ejercicio2[2] = 117100;//Ventana 300x130 L-15 mayor a 100m2
        
        ejercicio3[0] = 218500; //Ventana 204(alto) x 306(ancho) L-20 mayor a 100m2
        ejercicio3[1] = 140000;//Ventana 400x100 L-20 mayor a 100m2
        ejercicio3[2] = 525000;//Ventana 300x500 L-20 mayor a 100m2
        
        ejercicio4[0] = 12500; //Ventana 20(alto) x 36(ancho) L-25 menor a 100m2
        ejercicio4[1] = 19300;//Ventana 60x14 L-25 menor a 100m2
        ejercicio4[2] = 11800;//Ventana 25x25 L-25 menor a 100m2
    }
}

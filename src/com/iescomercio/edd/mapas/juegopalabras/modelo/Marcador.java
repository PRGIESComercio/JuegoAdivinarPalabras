package com.iescomercio.edd.mapas.juegopalabras.modelo;

/**
 * Clase basica para marcador con aciertos, fallos, intentos y puntuación
 * @author Roberto Vicente Pujades
 *
 */
public class Marcador {

    private int acertadas;
    private int falladas;
    private int intentos;
    private int puntuacion;

    public Marcador() {
        acertadas=0;
        falladas=0;
        intentos=0;
        puntuacion=0;
    }
    
    public void añadirAcierto(){
        this.acertadas=this.acertadas+1;
    }
    
    public void añadirFalladas(){
        this.falladas=this.falladas+1;
    }
    
    public void añadirIntento(){
        this.intentos=this.intentos+1;
    }
    
    public void añadirPuntuacion(int cantidad){
        this.puntuacion=this.puntuacion+cantidad;
    }
    
    public int numIntentos(){
        return this.intentos;
    }
    
    public int numAciertos(){
        return this.acertadas;
    }
    
    public int numFallos(){
        return this.falladas;
    }
    
    public int numPuntuacion(){
        return this.puntuacion;
    }
    
}

package com.iescomercio.edd.mapas.juegopalabras.modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Clase que guardará una palabra en inglés, alemán y español
 * @author Roberto Vicente Pujades
 *
 */
public class Palabras {

    private String español;
    private String ingles;
    private String aleman;
    
    /**
     * Variable que guarda el idioma aleatorio sacado para que funcione el método idiomaPalabrasFalladas
     */
    private int idiomaAleatorio; 

    public Palabras(String español, String ingles, String aleman) {
        this.español = español;
        this.ingles = ingles;
        this.aleman = aleman;
        this.idiomaAleatorio=0;
    }
    
    public Palabras(){
        this("","","");
    }

    public String getEspañol() {
        return español;
    }

    public void setEspañol(String español) {
        this.español = español;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getAleman() {
        return aleman;
    }

    public void setAleman(String aleman) {
        this.aleman = aleman;
    }
    
    /**
     * Método que devuelve un aleatorio (0,1 ó 2) que indicará el idioma elegido aleatoriamente
     * @return int Con 0, 1 ó 2. 0 español, 1 inglés y 2 alemán
     */
    public int idiomaAleatorio(){
        idiomaAleatorio = (int)Math.floor(Math.random() * 3);
        return idiomaAleatorio;
    }
    
    /**
     * Método que devuelve los aciertos, 0 si no ha acertado ningún idioma, 1 si ha acertado un idioma y 2 si ha acertado los dos idiomas
     * @param p Objeto Palabras con las introducidas por el usuario
     * @return int Con el número de aciertos
     */
    public int corregirPalabra(Palabras p){
        
        int aciertos = 0;
        
        if (this.getAleman().equals(p.getAleman())) aciertos = aciertos +1;
        if (this.getIngles().equals(p.getIngles())) aciertos = aciertos +1;
        if (this.getEspañol().equals(p.getEspañol())) aciertos = aciertos +1;
        
        if (aciertos != 0){
            return aciertos -1; //uno menos por que una palabra ya sale
        }else{
            return 0;
        }
        
    }
    
    /**
     * Método que devuelve un arraylist con los idiomas fallados
     * @param p Objeto Palabras con las introducidas por el usuario
     * @return ArrayList{@literal <String>} Con los idiomas fallados 
     */
    public ArrayList<String> idiomaPalabrasFalladas(Palabras p){
        ArrayList<String> l = new ArrayList();
        
        switch (idiomaAleatorio){
            case 0: //Infinitivo
                
                if (!this.getAleman().equals(p.getAleman())) l.add("Traducción");
                if (!this.getIngles().equals(p.getIngles())) l.add("Infinitivo");
                 
                break;
            case 1: //Past Simple
                
                if (!this.getAleman().equals(p.getAleman())) l.add("Traducción");
                if (!this.getEspañol().equals(p.getEspañol())) l.add("Español");
                
                break;
            case 2: //Tradución
                
                if (!this.getEspañol().equals(p.getEspañol())) l.add("Infinitivo");
                if (!this.getIngles().equals(p.getIngles())) l.add("Past Simple");
                
                break;
        }
        
        return l;
    }

    @Override
    public String toString() {
        return "Español: " + this.getEspañol() + " - Ingles: " + this.getIngles() + " - Aleman: " + this.getAleman();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.español);
        hash = 37 * hash + Objects.hashCode(this.ingles);
        hash = 37 * hash + Objects.hashCode(this.aleman);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Palabras other = (Palabras) obj;
        if (!Objects.equals(this.español, other.español)) {
            return false;
        }
        if (!Objects.equals(this.ingles, other.ingles)) {
            return false;
        }
        if (!Objects.equals(this.aleman, other.aleman)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
}

package com.iescomercio.edd.mapas.juegopalabras.modelo;

import java.util.HashMap;
import java.util.Set;

/**
 * Clase para guardar en un mapa de tipo HashMap String en la clave y Palabras en el objeto
 * @author Roberto Vicente Pujades
 *
 */
public class ListaPalabras {

    private HashMap<String,Palabras> listaPalabras;

    public ListaPalabras(HashMap listaPalabras) {
        this.listaPalabras = listaPalabras;
        cargarLista();
    }

    public ListaPalabras() {    
        this(new HashMap());      
    }

    public HashMap getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(HashMap listaPalabras) {
    this.listaPalabras = listaPalabras;
    }
    
    /**
     * Método que carga la lista de palabras con 20 palabras en ingles, alemán y español
     */
    public void cargarLista(){
        
        String[] palabrasEsp = {"libro","vaso","casa","dibujos","archivo","cerilla","diario","paraguas","toalla","almohada","sabana","manta","abrigo","blusa","vestido","diccionario","alfombra","cejas","pintura","mascara"};
        String[] palabrasIng = {"book","glass","house","cartoons","file","match","diary","umbrella","towel","pillow","sheet","blanket","coat","blouse","dress","dictionary","carpet","eyesbrow","paint","mask"};
        String[] palabrasAle = {"buch","glas","zuhause","zeichnungen","archivieren","streichholzer","taglich","regenschirm","handtuch","kissen","savanne","decke","mantel","bluse","kleid","worterbuch","teppich","augenbrauen","malerei","maske"};
        
        Palabras p;
        
        for (int i = 0; i < palabrasEsp.length; i++) {
            
            p = new Palabras();
            
            p.setEspañol(palabrasEsp[i]);
            p.setIngles(palabrasIng[i]);
            p.setAleman(palabrasAle[i]);
            
            this.listaPalabras.put(p.getEspañol(), p);
            
        }
        
        
    }
    
    /**
     * Método que devuelve la Palabra con los idiomas dándole la clave que es en español
     * @param clave String con la palabra en español, que es la clave del mapa
     * @return Palabras con la palabra en inglés alemán y español
     */
    public Palabras damePalabra(String clave){
        
        Palabras p;
        
        if (clave == null || clave.isEmpty()){
            return null;
        }
        
        p = (Palabras)this.listaPalabras.get(clave);
        
        return p;
    }
    
    /**
     * Método que devuelve una Palabra aleatoria
     * @return  Palabras con las palabras elegidas aleatoriamente
     */
    public Palabras palabraAleatoria(){
        //Creo una palabra
        Palabras p;
        //Paso las claves a un Set
        Set s = this.listaPalabras.keySet();
        //guardo el tamaño de la lista de palabras
        int tamaño = this.listaPalabras.size();
        //Me creo un array de objetos para las claves
        Object[] claves;
        //Meto el Set de las claves en el array de objetos
        claves = s.toArray();
        //Saco el número aleatorio
        int aleatorio = (int)Math.floor(Math.random() * tamaño);
        //guardo la palabra aleatoria
        p = this.damePalabra(claves[aleatorio].toString());
        
        return p;
    }
    
}

package com.iescomercio.edd.mapas.juegopalabras.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Palabras p;
        BufferedReader fpalabras;
        StringTokenizer linea;
        String aux;
        
        
        try {     
            // Abrir fichero
            File f = new File(getClass().getResource("/com/iescomercio/edd/mapas/juegopalabras/resources/verbos.txt").toURI());
            fpalabras = new BufferedReader (new FileReader(f));            
            aux = fpalabras.readLine();
          
            while (aux!=null){ 
                linea = new StringTokenizer(aux, "\t");

                int i = linea.countTokens();
                
                p = new Palabras();           
//                String s1= linea.nextToken();
//                String s2= linea.nextToken();
//                String s3= linea.nextToken();
//                String s4=  (new StringTokenizer(linea.nextToken(), ",")).nextToken();
//                System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
                
                p.setEspañol(linea.nextToken());
                p.setIngles(linea.nextToken());
                linea.nextToken();
                p.setAleman(new StringTokenizer(linea.nextToken(), ",").nextToken());
//                
                this.listaPalabras.put(p.getEspañol(), p);
                aux = fpalabras.readLine();                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListaPalabras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListaPalabras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(ListaPalabras.class.getName()).log(Level.SEVERE, null, ex);
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

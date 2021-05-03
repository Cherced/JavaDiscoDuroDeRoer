/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author HITMA
 */
public class Serie implements Entegable {

    //constantes de la clase:
    protected final static String TITULO_DEF = null;
    protected final static int NUM_TEMPORADAS_DEF = 3;
    protected final static boolean ENTREGADO_DEF = false;
    protected final static String GENERO_DEF = null;
    protected final static String CREADOR_DEF = null;
    //atributos de la clase:
    protected String titulo;
    protected int numTemporadas;
    protected boolean entregado;
    protected String genero;
    protected String creador;
    /**
     * Constante que indica que un objeto es mayor que otro
     */
    public final static int MAYOR=1;
  
    /**
     * Constante que indica que un objeto es menor que otro
     */
    public final static int MENOR=-1;
  
    /**
     * Constante que indica que un objeto es igual que otro
     */
    public final static int IGUAL=0;

    //constructores:
    //constructor por defecto:
    public Serie() {
        this(TITULO_DEF, NUM_TEMPORADAS_DEF, GENERO_DEF, CREADOR_DEF);
    }

    public Serie(String titulo, String creador) {
        this(titulo, NUM_TEMPORADAS_DEF, GENERO_DEF, creador);
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado =false;
    }
    //getters y setters:

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + '}';
    }
    
    @Override
    public int compareTo(Object a) {
        int estado=MENOR;
  
        //Hacemos un casting de objetos para usar el metodo get
        Serie ref=(Serie)a;
        if (numTemporadas>ref.getNumTemporadas()){
            estado=MAYOR;
        }else if(numTemporadas==ref.getNumTemporadas()){
            estado=IGUAL;
        }
  
        return estado;
    }

      /**
     * Cambia el estado de entregado a true
     */
    @Override
    public void entregar() {
        entregado=true;
    }
  
    /**
     * Cambia el estado de entregado a false
     */
    @Override
    public void devolver() {
        entregado=false;
    }
  
    /**
     * Indica el estado de entregado
     * @return 
     */
    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
          
    /**
     * Indica si dos Series son iguales, siendo el titulo y creador iguales
     * @param a Serie a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Serie a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())){
            return true;
        }
        return false;
    }
}
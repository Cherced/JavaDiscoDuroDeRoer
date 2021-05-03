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
public class VideoJuegos implements Entegable{

    // constantes de la clase:
    protected final static String TITULO_DEF = null;
    protected final static int HORAS_ESTIMADAS_DEF = 10;
    protected final static boolean ENTREGADO_DEF = false;
    protected final static String GENERO_DEF = null;
    protected final static String COMPANIA_DEF = null;
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
    //atributos de clase:
    protected String titulo;
    protected int horasEstimadas;
    protected boolean entregado;
    protected String genero;
    protected String compañia;
      
    //constructores: 
    public VideoJuegos() {
        this(TITULO_DEF, HORAS_ESTIMADAS_DEF, GENERO_DEF, COMPANIA_DEF);
    }

    public VideoJuegos(String titulo, int horasEstimadas) {
        this(titulo, horasEstimadas, GENERO_DEF, COMPANIA_DEF);
    }

    public VideoJuegos(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado = false;
    }
    //getters y setters:

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "VideoJuegos{" + "titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado + ", genero=" + genero + ", compa\u00f1ia=" + compañia + '}';
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
    public boolean equals(VideoJuegos a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getCompañia())){
            return true;
        }
        return false;
    }
  
    /**
     * Compara dos videojuegos segun el numero de paginas
     * @return codigo numerico
     * <ul>
     * <li>1: El videojuego 1 es mayor que el videojuego 2</li>
     * <li>0: Los videojuegos son iguales</li>
     * <li>-1: El videojuego 1 es menor que el videojuego 2</li></ul>
     */
    @Override
    public int compareTo(Object a) {
        int estado=MENOR;
  
        //Hacemos un casting de objetos para usar el metodo get
        VideoJuegos ref=(VideoJuegos)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=MAYOR;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=IGUAL;
        }
  
        return estado;
    }
}

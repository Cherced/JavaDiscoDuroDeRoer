/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

/**
 *
 * @author HITMA
 */
public final class Pasword {
    // declaramos las variables por defecto y dependeintes:
    private final static int LONG_DEF = 8;
    private int longitud;
    private String contraseña;
    // generamos los constructores, prodefecto y de parametros:
    public Pasword() {
        this(LONG_DEF);
    }
    //constructor para contraseña automatica:
    public Pasword(int longitud) {
        this.longitud = longitud;
        this.contraseña =generaPasword();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // creamos un metodo para verificar la seguridad de la contraseña, este devolvera un booleano confirmando o derrogando la seguridad de la contraseña.
    public boolean esFuerte() {
        int contMayus = 0;
        int contMinus = 0;
        int contNums = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) > 65 && contraseña.charAt(i) < 90) {
                contMayus++;
            } else if (contraseña.charAt(i) > 97 && contraseña.charAt(i) < 122) {
                contMinus++;
            } else {
                contNums++;
            }
        }
        if ((contMayus > 2 && contMinus > 1 && contNums > 5)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String generaPasword (){
        String pasword="";
        for (int i=0;i<longitud;i++){
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                pasword+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    pasword+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    pasword+=numeros;
                }
            }
        }
        return pasword;
    }

}

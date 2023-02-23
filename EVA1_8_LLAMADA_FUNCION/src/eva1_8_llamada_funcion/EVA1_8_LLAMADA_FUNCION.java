/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_llamada_funcion;

/**
 *
 * @author hp
 */
public class EVA1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA main");
        a();
        System.out.println("TEMINA main");
    }
    public static void a (){
         System.out.println("INICIA A()");
         b();
         System.out.println("TEMINA A()");
    }
    public static void b (){
         System.out.println("INICIA B()");
         System.out.println("TEMINA B()");
    }
    
}

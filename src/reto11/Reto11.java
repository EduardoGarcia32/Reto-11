/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto11;

/**
 *
 * @author alumnoutm
 */
public class Reto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for(int r = 0; r < args.length; r++){
            System.out.println(args[r]);
        }
        
        Principe personajeBuscado= new Principe("Augusto", 23, 1.85); 
        Principe propuesta2 = new Principe("Augusto", 23, 1.85); 
        Principe propuesta3 = new Principe("Guillermo", 30, 1.75);

            if(personajeBuscado.getNombre().equals(propuesta3.getNombre()) && personajeBuscado.getEdad() == propuesta3.getEdad() && personajeBuscado.getAltura() == propuesta3.getAltura()){
                System.out.println ("Era al personaje que estaba buscando");
                } else {
                    System.out.println ("Seguiré buscando");
            }

            if(personajeBuscado.getNombre().equals(propuesta2.getNombre())) {
                System.out.println ("Era al personaje que estaba buscando");
            }else {
                System.out.println ("Seguiré buscando");   
            }    
    }
    
}

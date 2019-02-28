/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import modelo.NewHibernateUtil;

/**
 *
 * @author virxi
 */
public class Principal 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        System.out.println("Introduzca un DNI:");
        Scanner sc = new Scanner(System.in);
        String dni = sc.next();
        
        NewHibernateUtil sesion = new NewHibernateUtil();
        boolean correcto = sesion.controlDni(dni);
        if(correcto == true)
        {
           sesion.datos(dni);
           sesion.incrementar(dni);
           sesion.eliminar(); 
        }
        else
        {
            System.out.println("ERROR");
        }
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
    Academica obxAcademia= new Academica();
    int nota= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la nota"));
    obxAcademia.setNome(JOptionPane.showInputDialog(null, "Introduce nombre"));
    obxAcademia.setNota(nota);
    obxAcademia.setNumReferencia(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce numero de referencia")));
    System.out.println(obxAcademia.toString());
    
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somanúmeros;

/**
 *
 * @author Admin
 */
public class SomaNúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma = 0;
        for (int i = 1; i <= 50; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 50 é: " + soma);
   

    }
    
}

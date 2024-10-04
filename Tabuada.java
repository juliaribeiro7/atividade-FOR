/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
        
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 10 para ver a tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Por favor, digite um número entre 1 e 10.");
        } else {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
        scanner.close();
    }
    
}

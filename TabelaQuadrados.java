/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabelaquadrados;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class TabelaQuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabela de quadrados: ");
        int limite = scanner.nextInt();

        System.out.println("Tabela de Quadrados:");
        for (int i = 1; i <= limite; i++) {
            System.out.println(i + "² = " + (i * i));
        }
        scanner.close();
    }
    
}

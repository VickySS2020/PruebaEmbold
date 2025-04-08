/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author campv
 */
public class CyclomaticTest {

    public static void main(String[] args) {
        Scanner entradaInt=new Scanner(System.in);
        System.out.println("Introduzca un numero:\na: ");
        int a=entradaInt.nextInt();
        
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("many");
                break;
            default:
                System.out.println("lots");
                break;
        }
    }
}

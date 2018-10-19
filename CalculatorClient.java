/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;

public class CalculatorClient {

    public static void main(String[] args) {
        try {
            Calcutator c = (Calcutator) Naming.lookup("CalculatorService");
            while(true){
                Thread.sleep(3000);
                System.out.println("Adição 1: " + c.add(20, 50));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

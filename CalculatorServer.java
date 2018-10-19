/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;
import java.rmi.Naming; 
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
    
public class CalculatorServer  
{ 
    CalculatorServer() 
    { 
        try
        { 
            System.setProperty("java.rmi.server.hostname", "192.168.1.107");
            LocateRegistry.createRegistry(1099);
            Calcutator c = new CalculatorImple(); 
            Naming.rebind("CalculatorService", (Remote)c); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
    } 
    public static void main(String[] args)  
    { 
        new CalculatorServer(); 
    } 
} 
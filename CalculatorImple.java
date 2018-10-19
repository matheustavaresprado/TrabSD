/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 
    
public class CalculatorImple extends UnicastRemoteObject implements Calcutator 
{ 
    protected CalculatorImple() throws RemoteException  
    { 
        super(); 
    } 
    public long add(long a, long b) throws RemoteException  
    { 
        System.out.println("Eu estou somando " + a + " e " + b);
        return a+b; 
    } 
}
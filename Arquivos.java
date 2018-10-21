/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsd;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author matheus
 */
public interface Arquivos extends Remote{
    
    public String ler(int numArq, int numClient,int inicio, int fim) throws RemoteException;
    
    public void escrever(int numArq, String text, int numClient, int pos) throws RemoteException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsd;

import java.rmi.Naming;

/**
 *
 * @author matheus
 */
public class ArquivosClient {
    public static int numClient = 1;
    public static void main(String[] args){
        try{
            Arquivos a = (Arquivos) Naming.lookup("ArquivosService");
            int meuNum = numClient++;
            a.ler(1, meuNum);
            a.ler(1, meuNum);
            a.ler(1, meuNum);
            a.escrever(1, "oi", meuNum);
            a.escrever(1, "oi", meuNum);
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

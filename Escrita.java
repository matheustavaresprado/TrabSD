/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsd;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author matheus
 */
public class Escrita implements Runnable{
    
    private int idClient;
    private int numArquivo;
    private int pos;
    private String texto;
    
    public Escrita(int id, int numArq, int pos, String texto){
        this.idClient = id;
        this.numArquivo = numArq;
        this.pos = pos;
        this.texto = texto;
        inicializa();
    }
    
    public void inicializa(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            Registry r = LocateRegistry.getRegistry("192.168.1.107", 1099);
            Arquivos a = (Arquivos) r.lookup("ArquivosService");
            a.escrever(this.numArquivo, this.texto, this.idClient, this.pos);
            System.out.println("O cliente " + this.idClient + " se conectou para ESCRITA no arquivo " + this.numArquivo + ".");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}

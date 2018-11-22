/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trabsd;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author matheus
 */
public class Leitura implements Runnable{
    
    private int idClient;
    private int numArquivo;
    private int inicio;
    private int fim;
    
    public Leitura(int id, int numArq, int inicio, int fim){
        this.idClient = id;
        this.numArquivo = numArq;
        this.inicio = inicio;
        this.fim = fim;
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
            a.ler(this.numArquivo, this.idClient, this.inicio, this.fim);
            System.out.println("O cliente " + this.idClient + " se conectou para LEITURA no arquivo " + this.numArquivo + ".");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}

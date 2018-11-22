/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trabsd;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus
 */
public class Documento {
    
    private String endereco;
    
    public Documento(String endereco){
        this.endereco = endereco;
    }
    
    public String ler(int inicio, int fim) {
        processar(new Random().nextInt(100)*100);
        return "";
    }
    
    public void escrever(int pos, String texto){
        processar(new Random().nextInt(100)*100);
    }
    
    public void processar(long temp){
        try {
            Thread.sleep(temp);
        } catch (InterruptedException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

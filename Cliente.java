/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trabsd;

import java.util.Random;

/**
 *
 * @author matheus
 */
public class Cliente {
    
    private int id;
    
    public Cliente(int id){
        this.id = id;
    }
    
    
    public void realizaRequisicao(){
        int a = new Random().nextInt(100);
        int numArq = new Random().nextInt(3);
        
        if(a < 30){
            new Escrita(this.id, numArq, 1, "TEXT");
        }
        else{
            new Leitura(this.id, numArq, 1, 10);
        }
    }
    
}

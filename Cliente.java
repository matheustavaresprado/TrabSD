/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsd;

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
        Random r = new Random();
        int a = r.nextInt(100);
        
        if(a < 0){
            new Escrita(this.id, 1, 1, "TEXT");
        }
        else{
            new Leitura(this.id, 1, 1, 10);
        }
    }
    
}

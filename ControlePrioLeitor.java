/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trabsd;

import java.util.concurrent.Semaphore;

/**
 *
 * @author matheus
 */
class ControlePrioLeitor implements Controle{
    
    private int qtdLeitores;
    private Semaphore acessoQtdLeitores;
    private Semaphore escrita;
    private Documento documento;
    
    public ControlePrioLeitor(Documento d){
        this.qtdLeitores = 0;
        this.documento = d;
        this.acessoQtdLeitores = new Semaphore(1);
        escrita = new Semaphore(1);
    }
    
    public void leitor() throws InterruptedException{
        this.acessoQtdLeitores.acquire();
        this.qtdLeitores++;
        if(this.qtdLeitores == 1)this.escrita.acquire();
        this.acessoQtdLeitores.release();
        
        this.documento.ler(1, 2);
        
        this.acessoQtdLeitores.acquire();
        this.qtdLeitores--;
        if(this.qtdLeitores == 0)this.escrita.release();
        this.acessoQtdLeitores.release();
    }
    
    public void escritor() throws InterruptedException{
        this.escrita.acquire();
        this.documento.escrever(1, "texto");
        this.escrita.release();
    }
   
}

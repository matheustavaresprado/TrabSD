/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trabsd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class ArquivosImple extends UnicastRemoteObject implements Arquivos {

    private GerenciaDoc gerenciador;

    protected ArquivosImple() throws RemoteException {
        super();
        this.gerenciador = new GerenciaDoc(2);// tp prioridade
    }

    @Override
    public String ler(int numArq, int numClient, int inicio, int fim) throws RemoteException {
        gerenciador.ler(numArq, inicio, fim);
        System.out.println("Leitura feita para o cliente " + numClient + ".");
        /*System.out.println("escritor = " + this.blockEscrita + " - " + numClient);
        while (this.blockEscrita == -1) {
            // Aguardando o escritor acabar
        }
        //System.out.println("Leitura iniciada para o cliente " + numClient + ". " + this.qtdLeitor);
        this.qtdLeitor = this.qtdLeitor + 1;
        String leitura = "sai do arquivo, é verdade essa string";
        long inicio = System.currentTimeMillis();
        while(System.currentTimeMillis() - inicio < 5000){
            //espera 5s
        }
        this.qtdLeitor = this.qtdLeitor - 1;
        System.out.println("Leitura feita para o cliente " + numClient + ". " + this.qtdLeitor);
        return leitura;*/
        return "";
    }

    @Override
    public void escrever(int numArq, String text, int numClient, int pos) throws RemoteException {
        this.gerenciador.escrever(numArq, pos, text);
        System.out.println("Escrita feita para o cliente " + numClient + ".");
        /*
        System.out.println("qtd leitores = " + this.qtdLeitor + " - " + numClient);
        while (this.qtdLeitor > 0 || this.blockEscrita == -1) {
           //if(numClient == 2)System.out.println(""+ this.qtdLeitor + " - " + this.blockEscrita);
        }
        
        this.blockEscrita = -1;
        long inicio = System.currentTimeMillis();
        while(System.currentTimeMillis() - inicio < 1000){
            
        }
        this.blockEscrita = 0;
        System.out.println("Escrita feita para o cliente " + numClient + ". "+qtdLeitor + " - "+blockEscrita);
        */
    }
}

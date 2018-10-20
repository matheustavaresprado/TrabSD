/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class ArquivosImple extends UnicastRemoteObject implements Arquivos {

    // controles
    private int blockEscrita = 0;
    private int qtdLeitor = 0;

    private ArrayList<Integer> controle;
    private ArrayList<String> arquivos;

    protected ArquivosImple() throws RemoteException {
        super();
        controle = new ArrayList();
        arquivos = new ArrayList();

        for (int i = 0; i < 3; i++) {
            controle.add(0);
        }
        arquivos.add("endereco 1");
        arquivos.add("endereco 2");
        arquivos.add("endereco 3");
        this.qtdLeitor = 0;
    }

    @Override
    public String ler(int numArq, int numClient) throws RemoteException {
        //System.out.println("escritor = " + this.blockEscrita + " - " + numClient);
        while (this.blockEscrita == -1) {
            // Aguardando o escritor acabar
        }
        //System.out.println("Leitura iniciada para o cliente " + numClient + ". " + this.qtdLeitor);
        System.out.println(qtdLeitor);
        this.qtdLeitor = this.qtdLeitor + 1;
        System.out.println(qtdLeitor);
        String leitura = "sai do arquivo, é verdade essa string";
        long inicio = System.currentTimeMillis();
        while(System.currentTimeMillis() - inicio < 5000){
            //espera 5s
        }
        System.out.println(qtdLeitor);
        this.qtdLeitor = this.qtdLeitor - 1;
        System.out.println(qtdLeitor);
        System.out.println("Leitura feita para o cliente " + numClient + ". " + this.qtdLeitor);
        return leitura;
    }

    @Override
    public void escrever(int numArq, String text, int numClient) throws RemoteException {
        
        System.out.println("qtd leitores = " + this.qtdLeitor + " - " + numClient);
        while (this.qtdLeitor > 0 || this.blockEscrita == -1) {
           // System.out.println(""+ this.qtdLeitor + " - " + this.blockEscrita);
        }
        this.blockEscrita = -1;
        long inicio = System.currentTimeMillis();
        while(System.currentTimeMillis() - inicio < 10000){
            
        }
        this.blockEscrita = 0;
        System.err.println("Escrita feita para o cliente " + numClient + ".");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trabsd;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus
 */
public class GerenciaDoc {

    private ArrayList<Controle> controles;

    public GerenciaDoc(int tpPrio) {
        controles = new ArrayList<>();

        if(tpPrio == 1){
            controles.add((Controle) new ControlePrioLeitor(new Documento("end0")));
            controles.add((Controle) new ControlePrioLeitor(new Documento("end1")));
            controles.add((Controle) new ControlePrioLeitor(new Documento("end2")));
        }
        else{
            controles.add((Controle) new ControleSemPrio(new Documento("end0")));
            controles.add((Controle) new ControleSemPrio(new Documento("end1")));
            controles.add((Controle) new ControleSemPrio(new Documento("end2")));
        }
    }

    public void ler(int numArquivo, int inicio, int fim) {
        Controle controle = controles.get(numArquivo);
        try {
            controle.leitor();
        } catch (InterruptedException ex) {
            Logger.getLogger(GerenciaDoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void escrever(int numArquivo, int pos, String texto){
        Controle controle = controles.get(numArquivo);
        try {
            controle.escritor();
        } catch (InterruptedException ex) {
            Logger.getLogger(GerenciaDoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

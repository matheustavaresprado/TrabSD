/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsd;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author matheus
 */
public class ArquivosServer {
    
    
    ArquivosServer(){
    
        try{
            System.setProperty("java.rmi.server.hostname", "192.168.1.107");
            LocateRegistry.createRegistry(1099);
            Arquivos a = new ArquivosImple();
            Naming.bind("ArquivosService", a);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
     new ArquivosServer();
    }
    
}

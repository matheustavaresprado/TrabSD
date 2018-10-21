/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabsd;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author matheus
 */
public class ArquivosClient {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(1);
        Cliente c2 = new Cliente(2);
        Cliente c3 = new Cliente(3);

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        for (int i = 0; i < 10; i++) {
            for (Cliente cliente : clientes) {
                //System.out.println(i);
                cliente.realizaRequisicao();
            }
        }
    }
}

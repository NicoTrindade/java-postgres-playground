package com.example;

import java.util.LinkedList;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {
        List<Cliente> clienteLista = new LinkedList<>();

        var cliente1 = new Cliente();
        cliente1.setNome("Nielson");
        cliente1.setCidade("Salvador");

        var cliente2 = new Cliente();
        cliente2.setNome("Maria da Sé");
        cliente2.setCidade("Maratuama de Baixo");

        clienteLista.add(cliente1);
        clienteLista.add(cliente2);

        for (Cliente cliente : clienteLista) {
            System.out.println(clienteLista);            
        }
    }
}

package com.example;

public class AppCliente {
    
    public static void main(String[] args) {
        System.out.println();
        Cliente cliente = new Cliente();

        cliente.setRenda(-10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1971);
        cliente.setNome("Nielson Trindae");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda do cliente: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());        
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println();
        var vetorNome = cliente.getNome().split(" ");
        System.out.println("Primeiro nome: " + vetorNome[0]);
        System.out.println("Segundo nome: " + vetorNome[1]);

        System.out.println();

        Cliente cliente2 = new Cliente(9000, 'D');

        //cliente2.setRenda(-4000);
        //cliente2.setSexo('F');
        cliente2.setAnoNascimento(1982);
        
        System.out.println("Renda do cliente2: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());        
        System.out.println("Especial: " + cliente2.isEspecial());
        System.out.println();
        
    }
    
}

package com.example;

import java.time.LocalDate;

public class AppEleicao {
    public static void main(String[] args) {
        var cidadao = new Cidadao();

        cidadao.setDataNascimento(LocalDate.of(1971, 9, 27));

        System.out.println("Idade do cidadão: " + cidadao.idade() + " anos.");
        System.out.println("Eleitor: " + cidadao.eleitor());
    }
    
}

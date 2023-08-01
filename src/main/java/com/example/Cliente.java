package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private int anoNascimento;
    private Boolean especial;

    public Cliente(){
        System.out.println("Criando o método construtor sem parâmetros.");        
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
    }

    public Cliente(double renda, char sexo){
        this();
        System.out.println("Criando o método construtor com parâmetros.");
        this.renda = renda;
        this.sexo = sexo;
    }
    
    public void isEspecial(Boolean especial){
            this.especial = especial;
    }

    public Boolean isEspecial(){
        return especial;
    }

    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda){
        if (renda >= 0)
            this.renda = renda;
        else
          System.out.println("O valor não pode ser negativo.");
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

}
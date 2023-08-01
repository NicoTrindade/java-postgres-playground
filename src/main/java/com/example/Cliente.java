package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private int anoNascimento;

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
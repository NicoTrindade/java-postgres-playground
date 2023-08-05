package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private String cidade;
    private int anoNascimento;
    private Boolean especial;
    private String nome;

    public Cliente(){
        System.out.println("Criando o método construtor sem parâmetros.");        
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
        else
            especial = false;
    }

    public Cliente(double renda, char sexo){
        this();
        System.out.println("Criando o método construtor com parâmetros.");       
        setRenda(renda);        
        setSexo(sexo);        
    }
    
    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public Boolean getEspecial() {
        return especial;
    }

    public void setEspecial(Boolean especial) {
        this.especial = especial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (sexo == 'M' || sexo == 'F' || sexo == 'm' || sexo == 'f')
          this.sexo = sexo;
        else
          System.out.println("Sexo inválido.");          
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String toString(){
        return "Cliente: " + nome + " Cidade: " + cidade;
    }

}
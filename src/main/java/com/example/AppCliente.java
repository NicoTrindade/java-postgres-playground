package com.example;

public class AppCliente {
    
    class Cliente{
        private double renda;
        private char sexo;
        private int anoNascimento;

        public double getRenda(){
            return renda;
        }

        public void setRenda(double renda){
            this.renda = renda;
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

    public static void main(String[] args) {
        Cliente cliente new Cliente();

        cliente.setRenda(10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1971);

        System.out.println("Renda do cliente: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());        
        
    }
    
}

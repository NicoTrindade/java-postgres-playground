package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBd {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
            System.out.println("Conexão com o banco de dados realizada com sucesso!");
            
            var statement = conn.createStatement();
            
            var result = statement.executeQuery("select * from estado");

            while(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("Id"), result.getString("nome"), result.getString("UF"));                
            }            

        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acessar o banco de dados. ");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar com o banco de dados. " + e.getMessage());
        }
    }
    
}

package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBdOtimizado {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) {
        new AppBdOtimizado();
    }

    public AppBdOtimizado(){
        try {var conn = getConnection();
            //carregarDriverJDBC();
            listarEstados(conn);
            localizarEstados(conn, "RJ");
        } catch (SQLException e) {            
            System.err.println("Não foi possível conectar ao banco de dados." + e.getMessage());       
        }
    }

    private static void localizarEstados(Connection conn, String uf) {
        try{
            var sql = "Select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery();
            if (result.next())
              System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
        }catch (SQLException e){
            System.out.println("Erro ao executar consulta SQL. " + e.getMessage());
        }        
    }

    private void listarEstados(Connection conn) {              
        try {
             System.out.println("Connexão ao banco de dados estabelecida com sucesso!");
             var statement = conn.createStatement();
             var result = statement.executeQuery("Select * from estado");                         
             while(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
             }  
             System.out.println();                  
        } catch (SQLException e) {
            System.err.println("Houve um erro na consulta ao banco de dados." + e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
       return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Drive");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível acessar a biblioteca para acessar o banco de dados." + e.getMessage());            
        }
    }    
}

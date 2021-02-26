package br.com.genesis.dal;

import java.sql.*;

public class ModuloConexao {

    // Método responsavel por estabelecer uma conexão com banco de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "Chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql//localhost:3306/dbgenesis";
        String login = "root";
        String password = "";
        //Estabelecendo a conexão com banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, login, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

}

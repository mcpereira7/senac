package br.com.senac.fabio.jdbc.samplesqlexecutor;

//Executor de códigos SQL

import br.com.senac.fabio.jdbc.connection.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlTest {
    //Elemento para armazenamento da conexão
    private static Connection con = null;
    
    //Método de execução principal
    public static void main(String[] args) {
        //Tratamento de erros de conexão com o banco
        try {
            //Tenta obter uma conexão com o banco
            con = ConnectionUtils.getConnection();
            System.out.println("Conectado!");
            
            //SEU COMANDO SQL AQUI!
            
//            insert();
            listAll();
            System.out.println("#################################");
//            update();
            delete();
            System.out.println("#################################");
            listAll();
            
        }
        catch(Exception e) {
            //Imprime erros de conexão
            e.printStackTrace();
        }
        finally {
            //Trata erros do fechamento de conexão com o banco de dados
            try {
                //Tenta fechar a conexão com o banco
                con.close();
            }
            catch(Exception e) {
                //Imprime erros de fechamento de conexão
                e.printStackTrace();
            }
        }
    }
    
    private static void insert() throws SQLException{
        String sql = "INSERT INTO cliente VALUES(?,?,?)";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1, 7);
        pst.setString(2, "Tia");
        pst.setInt(3, 33);
        
        pst.execute();
    }
    
    private static void listAll() throws SQLException{
        String sql = "SELECT * FROM cliente";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            System.out.println("Nome: " + rs.getString("nome")+ 
                    " Idade: " + rs.getInt("Idade"));
        }
    }
    
    private static void update()throws SQLException{
        
        String sql = "UPDATE cliente SET nome=?, idade=? WHERE id=?";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setString(1, "Vô");
        pst.setInt(2, 60);
        pst.setInt(3, 6);
        
        pst.execute();
    }
    
    private static void delete() throws SQLException{
        
        String sql = "DELETE FROM cliente WHERE id=?";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setInt(1, 6);
        
        pst.execute();
    }
}

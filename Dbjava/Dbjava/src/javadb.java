import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class javadb {
public static void main (String []args) {
    try {
     // conecta no banco
     Class.forName("com.mysql.cj.jdbc.Driver");
                                                                                   // appfuncionarios nome do bando 
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Unana","root","887956");
     Statement clausula = con.createStatement();
     // executa a clausula SQL
                                                                  // cliente = tabela
     ResultSet result = clausula.executeQuery("SELECT * FROM Clientes");
     // acessando a resposta do banco
     while (result.next()) {
         System.out.println(result.getString("Nome"));
     }
     // fechando a conexao
     con.close();

    }     catch (Exception e) {
        // TODO: handle exception
        System.out.println(" Deu erro " + e.getMessage());
    }

}}


       
    

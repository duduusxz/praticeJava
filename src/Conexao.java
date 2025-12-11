import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {

        Connection conexao = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/databasejava", "usuario", "senha");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while (rsCliente.next()){
                System.out.println("Nome: "+rsCliente.getString("nome"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do Banco de Dados não localizado.");
        } catch (SQLException ex){
            System.out.println("Erro ao conectar no banco de dados: " + ex.getMessage());
        } finally {
            if(conexao != null){
                conexao.close();
            }
        }
    }
}

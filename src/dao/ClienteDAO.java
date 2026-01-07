package dao;

import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void cadastrar(Cliente cliente) {

        String sql = "INSERT INTO CLIENTE (email, nome) VALUES (?, ?)";

        try (
                Connection conn = Conexao.getConexao();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, cliente.getEmail());
            stmt.setString(2, cliente.getNome());

            stmt.executeUpdate();
            System.out.println("✅ Cliente salvo no banco!");

        } catch (SQLException e) {
            System.out.println("❌ Erro ao salvar cliente: " + e.getMessage());
        }
    }

    public List<Cliente> listar() {

        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT email, nome FROM cliente";

        try (
                Connection conn = Conexao.getConexao();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                clientes.add(
                        new Cliente(
                                rs.getString("email"),
                                rs.getString("nome")
                        )
                );
            }
        } catch (SQLException e) {
            System.out.println("❌ Erro ao listar: " + e.getMessage());
        }

        return clientes;
    }
}
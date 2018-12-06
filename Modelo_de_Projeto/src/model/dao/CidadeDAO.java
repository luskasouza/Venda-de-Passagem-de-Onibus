package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cidade;

/**
 *
 * @author 20161timinf022
 */
public class CidadeDAO {
     //Adisonar no Banco de Dados
    public void create(Cidade cidade) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO cidade (cidadeAtual,cidadeDestino)VALUES(?,?)");
            stmt.setString(1, cidade.getCidadeAtual());
            stmt.setString(2, cidade.getCidadeDestino());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salva ??? " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    //Lista dados do banco na tabela 
    public List<Cidade> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cidade> cidades = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cidade");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setIdCidade(rs.getInt("idCidade"));
                cidade.setCidadeAtual(rs.getString("cidadeAtual"));
                cidade.setCidadeDestino(rs.getString("cidadeDestino"));
                cidades.add(cidade);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cidades;
    }
    //Atualizar dados no banco
    public void update(Cidade cidade) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE cidade SET cidadeAtual = ? ,cidadeDestino = ? WHERE idCidade = ?");
            stmt.setString(1, cidade.getCidadeAtual());
            stmt.setString(2, cidade.getCidadeDestino());
            stmt.setInt(3, cidade.getIdCidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    //Deletar do banco de dados
    public void delete(Cidade cidade) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM cidade WHERE idCidade = ?");
            stmt.setInt(1, cidade.getIdCidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
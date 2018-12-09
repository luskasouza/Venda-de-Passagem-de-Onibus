package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Passagem;

/**
 *
 * @author Lukas Souza
 */
public class PassagemDAO {
    //Adisonar no Banco de Dados
    public void create(Passagem passagem) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO passagem (quantidade,preco,data) VALUES (?,?,?)");
            stmt.setInt(1, passagem.getQuantidade());
            stmt.setDouble(2, passagem.getPreco());
            stmt.setDate(3, (Date) passagem.getData());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salva ??? " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    //Lista dados do banco na tabela 
    public List<Passagem> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Passagem> passagens = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM passagem");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Passagem passagem = new Passagem();
                passagem.setIdPassagens(rs.getInt("idPassagens"));
                passagem.setQuantidade(rs.getInt("quantidade"));
                passagem.setPreco(rs.getDouble("preco"));
                passagem.setData(rs.getDate("data"));
                passagens.add(passagem);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return passagens;
    }
    //Atualizar dados no banco
    public void update(Passagem passagem) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE passagem SET quantidade = ? ,preco = ?,data = ? WHERE idPassagens = ?");
            stmt.setInt(1, passagem.getQuantidade());
            stmt.setDouble(2, passagem.getPreco());
            stmt.setDate(3, (Date) passagem.getData());
            stmt.setInt(4, passagem.getIdPassagens());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    //Deletar do banco de dados
    public void delete(Passagem passagem) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM passagem WHERE idPassagens = ?");
            stmt.setInt(1, passagem.getIdPassagens());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

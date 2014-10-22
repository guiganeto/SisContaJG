/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexaoDB.Conexao;
import bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UsuarioDao {

    // verifica o login e senha
    public boolean logar(Usuario usuario) {
        String sql = "SELECT * FROM usuario where login_usuario=? and senha_usuario=?";
        boolean resultado = true;
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario.getLogin().toLowerCase().trim());
            pst.setString(2, usuario.getSenha().toLowerCase().trim());
            rs = pst.executeQuery();
            if(rs.next()) {
                resultado = true;
                rs.close();
                pst.close();
            } else {
                resultado = false;
            }
        } catch(SQLException exception) {
            resultado = false;
            System.out.println("ERRO: " + exception.getMessage());
        }
        
        return resultado;
    }
    
    // verifica se é Admin ou Usuario
    public boolean verifica_Acesso(Usuario usuario) {
        String sql = "select * from usuario where login_usuario=? and tipo_usuario=?";
        boolean resultado = true;
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario.getLogin());
            pst.setString(2, usuario.getTipo());
            rs = pst.executeQuery();
            if(rs.next()) {
                resultado = true;
                rs.close();
                pst.close();
            } else {
                resultado = false;
            }
        } catch(SQLException exception) {
            resultado = false;
            System.out.println("ERRO: " + exception.getMessage());
        }
        return resultado;
    }
    
    // salva os registros no banco de dados
    public boolean salvar(Usuario usuario) {
        String sql = "Insert into usuario(nome_usuario, cpf_usuario, fone_usuario,"
                + " login_usuario, senha_usuario, tipo_usuario) values(?,?,?,?,?,?)";
        boolean resultado = true;
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario.getNome().toUpperCase().trim());
            pst.setString(2, usuario.getCPF().trim());
            pst.setString(3, usuario.getTelefone().trim());
            pst.setString(4, usuario.getLogin().trim());
            pst.setString(5, usuario.getSenha());
            pst.setString(6, usuario.getTipo());
            pst.execute();
        } catch (SQLException exception) {
            resultado = false;
            System.out.println("ERRO: " + exception.getMessage());
        }
        return resultado;
    }
    
    // método que efetua pesquisa pelo nome ou partes dele
    public boolean pesquisar(Usuario usuario) {
        String sql = "select * from usuario where nome_usuario like ?";
        boolean resultado = true;
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario.getNome() + "%");
            rs = pst.executeQuery();
            while(rs.next()) {
                usuario.setCodigo(rs.getInt("cod_usuario"));
                usuario.setNome(rs.getString("nome_usuario"));
                usuario.setCPF(rs.getString("cpf_usuario"));
                usuario.setTelefone(rs.getString("fone_usuario"));
            }
        } catch(SQLException exception) {
            resultado = false;
            System.out.println("ERRO: " + exception.getMessage());
        }
        return resultado;
    }
    
    // altera e/ou atualiza os registros no Banco de Dados
    public void alterar(Usuario usuario) {
        String sql = "update usuario set nome_usuario='"+usuario.getNome()+"', cpf_usuario='"+usuario.getCPF()+"',"
                    + " fone_usuario='"+usuario.getTelefone()+"' where cod_usuario='"+usuario.getCodigo()+"'";
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch(SQLException exception) {
            System.out.println("ERRO: " + exception.getMessage());
        }
    }
    
    // deleta registros de Usuarios
    public void deletar(Usuario usuario) {
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        int pergunta = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar?", "Deletar usuário", 
                JOptionPane.YES_NO_OPTION);
        if(pergunta == 0) {
            String sql = "delete from usuario where cod_usuario=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1, usuario.getCodigo());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
            } catch(SQLException exception) {
                System.out.println("ERRO: " + exception.getMessage());
              }         
        }
    }
    
    // método permite que, clicando na tabela, mostre alguns dados dos usuarios
    public void clica_tabela(Usuario usuario, String clica) {
        String sql = "select * from usuario where cod_usuario=" + clica + "";
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql); 
            rs = pst.executeQuery(sql);
            while(rs.next()) {
                usuario.setCodigo(rs.getInt("cod_usuario"));
                usuario.setNome(rs.getString("nome_usuario"));
                usuario.setCPF(rs.getString("cpf_usuario"));
                usuario.setTelefone(rs.getString("fone_usuario"));
            }
        } catch(SQLException exception) {
             System.out.println("ERRO: " + exception.getMessage());
        }
    }
    
    // método que alimenta a tabela com o Banco de Dados
    public ResultSet atualizar_tabela() {
        String sql = "select cod_usuario AS CODIGO, nome_usuario AS NOME, cpf_usuario AS CPF,"
                    + " fone_usuario AS TELEFONE from usuario";
        Connection conn = Conexao.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql); // permite o uso de parâmetros nos comandos SQL, permitindo o uso do mesmo comando SQL
            rs = pst.executeQuery(sql); // O objeto ResultSet mantém um cursor posicionado antes da primeira linha de dados
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}

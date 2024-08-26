package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Usuarios;

public class UsuariosDAO {
    
    public boolean verificarLogin(Usuarios user) {
        Usuarios usuario = new Usuarios();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE email = ? and senha = ?");
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getSenha());
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarUsuario(Usuarios novoUsuario) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)");
            
            stmt.setString(1, novoUsuario.getNome());
            stmt.setString(2, novoUsuario.getEmail());
            stmt.setString(3, novoUsuario.getSenha());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

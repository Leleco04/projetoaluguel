/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Carros;

/**
 *
 * @author Senai
 */
public class CarrosDAO {
    public List<Carros> lerCarros() {
        List<Carros> carros = new ArrayList();
        try {
            
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement("SELECT * FROM carros");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Carros carro = new Carros();
                carro.setId_carro(rs.getInt("id_carro"));
                carro.setMarca(rs.getString("marca"));
                carro.setModelo(rs.getString("modelo"));
                carro.setAno(rs.getInt("ano"));
                carro.setPlaca(rs.getString("placa"));
                carro.setPreco_diaria(rs.getInt("preco_diaria"));
                
                carros.add(carro);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    return carros;
    }
}

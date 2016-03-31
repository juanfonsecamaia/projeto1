/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Cliente;
import Outros.DataSetPadrao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner Chaves
 */
public class ClienteDAO {
    private Connection con;
    private String user;
    private String url;
    private String password;

    public ClienteDAO() {
        url = "jdbc:mysql://localhost/db_loja";
        user = "root";
        password = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserir(Cliente c) {
        String sqlcli = "INSERT INTO tb_cliente (NOME_CLI, DTA_NASC_CLI, CPF_CLI, RG_CLI, TEL_CLI, ENDERECO_CLI, BAIRRO_CLI, CIDADE_CLI, CEP_CLI, ESTADO_CLI, OBS_CLI) VALUES('" + c.getNome() + "', '" + c.getDataNascimento() + "','" + c.getCPF()+ "','" + c.getRG()+ "','" + c.getTelefone()+ "','" + c.getEndereco()+ "','" + c.getBairro()+ "','" + c.getCidade()+ "','" + c.getCEP()+ "','" + c.getEstado() + "','" + c.getObservacoes() + "');";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(sqlcli);
            JOptionPane.showMessageDialog(null, "Cadastro do cliente " + c.getNome() + " realizado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    public DataSetPadrao pesquisar(int opcao, String filtro) {
        String cmp;
        String sql;
        String bS, eS;
        switch (opcao) {
            case 0:cmp = "CPF_CLI LIKE ";bS = "'%";eS = "%'";break;
            case 1:cmp = "NOME_CLI LIKE ";bS = "'%";eS = "%'";break;
            case 2:cmp = "CIDADE_CLI LIKE ";bS = "'%";eS = "%'";break;
            default:cmp = bS = eS = "*";break;//flag de erro
        }
        sql = "SELECT COD_CLI AS \"Código\",NOME_CLI AS \"Nome\",DTA_NASC_CLI AS \"Data de Nascimento\",CPF_CLI AS \"CPF\",RG_CLI AS \"RG\",TEL_CLI AS \"Telefone\",ENDERECO_CLI AS \"Endereco\",BAIRRO_CLI AS \"Bairro\",CIDADE_CLI AS \"Cidade\",CEP_CLI AS \"CEP\",ESTADO_CLI AS \"UF\", OBS_CLI AS \"Observacoes\" FROM tb_cliente where " + cmp + bS + filtro + eS + ";";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DataSetPadrao pds = new DataSetPadrao();
            int i;
            for(i=1;i<=rs.getMetaData().getColumnCount();i++){
                pds.addColumnName(rs.getMetaData().getColumnName(i));
            }
            while(rs.next()){
                Vector<Object> vector = new Vector<Object>();
                for(i=1;i<=rs.getMetaData().getColumnCount();i++){
                    vector.add(rs.getObject(i));
                }
                pds.addData(vector);
            }
            return pds;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    
    public void editar(Cliente c)
    {
        String sqlcli = "UPDATE tb_cliente set NOME_CLI = '"+c.getNome()+"', DTA_NASC_CLI='"+c.getDataNascimento()+"', CPF_CLI = '"+c.getCPF()+"', RG_CLI = '"+c.getRG()+"', TEL_CLI = '"+c.getTelefone()+"', ENDERECO_CLI = '"+c.getEndereco()+"', BAIRRO_CLI = '"+c.getBairro()+"', CIDADE_CLI = '"+c.getCidade()+ "', CEP_CLI = '" + c.getCEP()+ "', ESTADO_CLI = '" + c.getEstado()+ "', OBS_CLI = '" + c.getObservacoes() +"' where COD_CLI = '"+Integer.toString(c.getCodigo())+"';";
        Statement st;
        try {
            st = con.createStatement();
            st.executeUpdate(sqlcli);
            JOptionPane.showMessageDialog(null, "Cliente de CPF "+ c.getCPF()+" atualizado");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletar(Integer codigo)
    {
        String sqlcli = "DELETE FROM tb_cliente where COD_CLI = '"+Integer.toString(codigo)+"'; ";
        Statement st;
        try {
            st = con.createStatement();
            st.executeUpdate(sqlcli);
            JOptionPane.showMessageDialog(null, "Cliente de CPF "+Integer.toString(codigo)+" excluído");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}

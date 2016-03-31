/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Wagner Chaves
 */
public class Cliente {
    private int Codigo; //Usado apenas na consulta
    private String Nome;
    private String DataNascimento;
    private String CPF;
    private String RG;
    private String Telefone;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String CEP;
    private String Estado;
    private String Observacoes;
    
    public Cliente(String nome, String dtaNasc, String cpf, String rg, String tel, String endereco, String bairro, String cidade, String cep, String estado, String obs){
        this.Nome = nome;
        this.DataNascimento = dtaNasc;
        this.CPF = cpf;
        this.RG = rg;
        this.Telefone = tel;
        this.Endereco = endereco;
        this.Bairro = bairro;
        this.Cidade = cidade;
        this.CEP = cep;
        this.Estado = estado;
        this.Observacoes = obs;
    }
    public Cliente(){
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dtaNasc) {
        this.DataNascimento = dtaNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rg) {
        this.RG = rg;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String tel) {
        this.Telefone = tel;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        this.Bairro = bairro;
    }    
    
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        this.Cidade = cidade;
    }    
    
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cep) {
        this.CEP = cep;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }    
    
    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String obs) {
        this.Observacoes = obs;
    }    

}

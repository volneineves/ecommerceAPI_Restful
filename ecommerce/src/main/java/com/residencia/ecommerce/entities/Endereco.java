package com.residencia.ecommerce.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Endereco {
    private Integer enderecoId;
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String numero;
    private String complemento;
    private String uf;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    
    @Column(name = "cep")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Column(name = "rua")
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    
    @Column(name = "bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    @Column(name = "cidade")
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    @Column(name = "complemento")
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
    @Column(name = "uf")
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @OneToMany(mappedBy = "enderecoByEnderecoId")
    private Collection<Cliente> clientesByEnderecoId;

    public Collection<Cliente> getClientesByEnderecoId() {
        return clientesByEnderecoId;
    }

    public void setClientesByEnderecoId(Collection<Cliente> clientesByEnderecoId) {
        this.clientesByEnderecoId = clientesByEnderecoId;
    }
}
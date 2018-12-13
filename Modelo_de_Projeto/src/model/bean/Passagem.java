package model.bean;

import java.util.Date;


/**
 *
 * @author Lukas Souza
 */
public class Passagem {
    private int idPassagens;
    private int quantidade;
    private double preco;
    private Date data;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdPassagens() {
        return idPassagens;
    }

    public void setIdPassagens(int idPassagens) {
        this.idPassagens = idPassagens;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public  double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

 }
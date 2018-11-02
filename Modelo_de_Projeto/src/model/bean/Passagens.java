package model.bean;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Lukas Souza
 */
public class Passagens {
    private int idPassagens;
    private int quantidadeDePassagens;
    private double precoPassagens;
    private Date dataDacompra;
    private Time horaDacompra;

    public int getIdPassagens() {
        return idPassagens;
    }

    public void setIdPassagens(int idPassagens) {
        this.idPassagens = idPassagens;
    }

    public int getQuantidadeDePassagens() {
        return quantidadeDePassagens;
    }

    public void setQuantidadeDePassagens(int quantidadeDePassagens) {
        this.quantidadeDePassagens = quantidadeDePassagens;
    }

    public double getPrecoPassagens() {
        return precoPassagens;
    }

    public void setPrecoPassagens(double precoPassagens) {
        this.precoPassagens = precoPassagens;
    }

    public Date getDataDacompra() {
        return dataDacompra;
    }

    public void setDataDacompra(Date dataDacompra) {
        this.dataDacompra = dataDacompra;
    }

    public Time getHoraDacompra() {
        return horaDacompra;
    }

    public void setHoraDacompra(Time horaDacompra) {
        this.horaDacompra = horaDacompra;
    }
    
    
}

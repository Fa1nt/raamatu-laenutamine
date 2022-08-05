package com.raamatulaenutamine.backend.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Raamat {

    @Id
    @Column
    private int id;

    @Column
    private String pealkiri;

    @Column
    private Boolean broneeritud;

    @Column
    private Boolean laenutatud;

    @Column
    private Date kuup2ev;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPealkiri() {
        return pealkiri;
    }

    public void setPealkiri(String pealkiri) {
        this.pealkiri = pealkiri;
    }

    public Boolean getBroneeritud() {
        return broneeritud;
    }

    public void setBroneeritud(Boolean broneeritud) {
        this.broneeritud = broneeritud;
    }

    public Boolean getLaenutatud() {
        return laenutatud;
    }

    public void setLaenutatud(Boolean laenutatud) {
        this.laenutatud = laenutatud;
    }

    public Date getKuup2ev() {
        return kuup2ev;
    }

    public void setKuup2ev(Date kuup2ev) {
        this.kuup2ev = kuup2ev;
    }

}

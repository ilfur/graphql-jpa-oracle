/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ichag.partner.data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author MPFEIFER
 *type Rechtschutz {
    vertragsnummer: Int!,
    produktLangname: String!
}*/
@Entity
public class Rechtschutz implements java.io.Serializable {
    private Integer partnernummer;
    @Id
    private Integer vertragsnummer;
    private String produktLangname;

    public void setPartnernummer(Integer partnernummer) {
        this.partnernummer = partnernummer;
    }

    public void setVertragsnummer(Integer vertragsnummer) {
        this.vertragsnummer = vertragsnummer;
    }

    public void setProduktLangname(String produktLangname) {
        this.produktLangname = produktLangname;
    }

    public Integer getPartnernummer() {
        return partnernummer;
    }

    public Integer getVertragsnummer() {
        return vertragsnummer;
    }

    public String getProduktLangname() {
        return produktLangname;
    }
}

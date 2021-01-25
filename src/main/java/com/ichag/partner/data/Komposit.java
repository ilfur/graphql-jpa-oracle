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
 *type Komposit {
    vertragsnummer: Int!,
    objektArt: String!,
    objektNr: String!,
    objektBezeichnung: String!,
    produktLangname: String!
}*/
@Entity
public class Komposit implements java.io.Serializable{
    private Integer partnernummer;
    @Id
    private Integer vertragsnummer;
    private String objektArt;
    private String objektNr;
    private String objektBezeichnung;
    private String produktLangname;

    public void setPartnernummer(Integer partnernummer) {
        this.partnernummer = partnernummer;
    }

    public void setVertragsnummer(Integer vertragsnummer) {
        this.vertragsnummer = vertragsnummer;
    }

    public void setObjektArt(String objektArt) {
        this.objektArt = objektArt;
    }

    public void setObjektNr(String objektNr) {
        this.objektNr = objektNr;
    }

    public void setObjektBezeichnung(String objektBezeichnung) {
        this.objektBezeichnung = objektBezeichnung;
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

    public String getObjektArt() {
        return objektArt;
    }

    public String getObjektNr() {
        return objektNr;
    }

    public String getObjektBezeichnung() {
        return objektBezeichnung;
    }

    public String getProduktLangname() {
        return produktLangname;
    }
}

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
 *
 * type KFZ {
    vertragsnummer: Int!,
    objektArt: String!,
    objektNr: String!,
    produktLangname: String!
    objektBezeichnung: String!
}*/
@Entity
public class Kfz implements java.io.Serializable{

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

    public void setProduktLangName(String produktLangName) {
        this.produktLangName = produktLangName;
    }

    public void setObjektBezeichnung(String objektBezeichnung) {
        this.objektBezeichnung = objektBezeichnung;
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

    public String getProduktLangName() {
        return produktLangName;
    }

    public String getObjektBezeichnung() {
        return objektBezeichnung;
    }
    private Integer partnernummer;
    @Id
    private Integer vertragsnummer;
    private String objektArt;
    private String objektNr;
    private String produktLangName;
    private String objektBezeichnung;
}

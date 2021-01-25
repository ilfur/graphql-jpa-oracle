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
 *type Schaeden {
     schadenIdentNummer: Int!,
     bearbeitungStatus: String!,
     schadendatum: String!,
     risikobereichBezeichnung: String!
}
*/
@Entity
public class Schaeden implements java.io.Serializable {
    private Integer partnernummer;
    @Id
    private Integer schadenIdentNummer;
    private String bearbeitungStatus;
    private String schadendatum;
    private String risikobereichBezeichnung;

    public void setPartnernummer(Integer partnernummer) {
        this.partnernummer = partnernummer;
    }

    public void setSchadenIdentNummer(Integer schadenIdentNummer) {
        this.schadenIdentNummer = schadenIdentNummer;
    }

    public void setBearbeitungStatus(String bearbeitungStatus) {
        this.bearbeitungStatus = bearbeitungStatus;
    }

    public void setSchadendatum(String schadendatum) {
        this.schadendatum = schadendatum;
    }

    public void setRisikobereichBezeichnung(String risikobereichBezeichnung) {
        this.risikobereichBezeichnung = risikobereichBezeichnung;
    }

    public Integer getPartnernummer() {
        return partnernummer;
    }

    public Integer getSchadenIdentNummer() {
        return schadenIdentNummer;
    }

    public String getBearbeitungStatus() {
        return bearbeitungStatus;
    }

    public String getSchadendatum() {
        return schadendatum;
    }

    public String getRisikobereichBezeichnung() {
        return risikobereichBezeichnung;
    }
}

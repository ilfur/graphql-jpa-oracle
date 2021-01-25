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
 type Partner {
  partnernummer: Int!,
  name: String!,
  vorname: String!,
  anrede: String!,
  name2: String!,
  geburtstag: String!,
  kfz: [KFZ],
  komposit: [Komposit],
  rechtschutz: [Rechtschutz],
  schaeden: [Schaeden]
}*/
@Entity
public class Partner implements java.io.Serializable{

    public void setPartnernummer(Integer partnernummer) {
        this.partnernummer = partnernummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }

    public Integer getPartnernummer() {
        return partnernummer;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getAnrede() {
        return anrede;
    }

    public String getName2() {
        return name2;
    }

    public String getGeburtstag() {
        return geburtstag;
    }

    private static final long serialVersionUID = 1L;
    @Id
    private Integer partnernummer;
    private String name;
    private String vorname;
    private String anrede;
    private String name2;
    private String geburtstag;
    
}

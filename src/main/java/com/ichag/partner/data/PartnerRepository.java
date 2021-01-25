/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ichag.partner.data;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author MPFEIFER
 */
public class PartnerRepository {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("svipartner");
    private EntityManager entityManager = null;
    
    public PartnerRepository() {
        if (entityManager == null)
            entityManager = emf.createEntityManager();
        //Partner prt = entityManager.find(Partner.class, new Integer(1000));
        //System.out.println (prt.getName()+" "+prt.getVorname());
    }
        
    public static Partner findPartnerById(Integer partnernummer) {
        PartnerRepository pr = new PartnerRepository();
        Partner prt = pr.entityManager.find(Partner.class, partnernummer);
        //System.out.println (prt.getName()+" "+prt.getVorname());
        return prt;
    }

    public static List<Kfz> findKfzByPartner(Integer partnernummer) {
        PartnerRepository pr = new PartnerRepository();
        return pr.entityManager.createQuery("SELECT b FROM Kfz b WHERE b.partnernummer = :partnernummer", Kfz.class)
                .setParameter("partnernummer", partnernummer)
                .getResultList();
    }

    public static List<Komposit> findKompositByPartner(Integer partnernummer) {
        PartnerRepository pr = new PartnerRepository();
        return pr.entityManager.createQuery("SELECT b FROM Komposit b WHERE b.partnernummer = :partnernummer", Komposit.class)
                .setParameter("partnernummer", partnernummer)
                .getResultList();
    }

    public static List<Rechtschutz> findRechtschutzByPartner(Integer partnernummer) {
        PartnerRepository pr = new PartnerRepository();
        return pr.entityManager.createQuery("SELECT b FROM Rechtschutz b WHERE b.partnernummer = :partnernummer", Rechtschutz.class)
                .setParameter("partnernummer", partnernummer)
                .getResultList();
    }

    public static List<Schaeden> findSchaedenByPartner(Integer partnernummer) {
        PartnerRepository pr = new PartnerRepository();
        return pr.entityManager.createQuery("SELECT b FROM Schaeden b WHERE b.partnernummer = :partnernummer", Schaeden.class)
                .setParameter("partnernummer", partnernummer)
                .getResultList();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ichag.partner.web;

import com.ichag.partner.data.PartnerRepository;
import graphql.schema.DataFetcher;

/**
 *
 * @author MPFEIFER
 */

public class PartnerWiring {
    
 // we define the normal StarWars data fetchers so we can point them at our data loader
    static DataFetcher partnerDataFetcher = environment -> {
        Integer pnum = environment.getArgument("partnernummer");
        return PartnerRepository.findPartnerById(pnum);
    };
        

    static DataFetcher kompositDataFetcher = environment -> {
        com.ichag.partner.data.Partner p = environment.getSource();
        return PartnerRepository.findKompositByPartner(p.getPartnernummer());
    };

    static DataFetcher kfzDataFetcher = environment -> {
        com.ichag.partner.data.Partner p = environment.getSource();
        return PartnerRepository.findKfzByPartner(p.getPartnernummer());

    };

    static DataFetcher rechtschutzDataFetcher = environment -> {
        com.ichag.partner.data.Partner p = environment.getSource();
        return PartnerRepository.findRechtschutzByPartner(p.getPartnernummer());

    };

    static DataFetcher schaedenDataFetcher = environment -> {
        com.ichag.partner.data.Partner p = environment.getSource();
        return PartnerRepository.findSchaedenByPartner(p.getPartnernummer());

    };

    /*static DataFetcher friendsDataFetcher = environment -> {
        FilmCharacter character = environment.getSource();
        List<String> friendIds = character.getFriends();
        List<FilmCharacter> chars = new java.util.ArrayList();
        for (String id : friendIds) {
            FilmCharacter fc = (FilmCharacter)(PartnerRepository.getCharacterData(id));
            chars.add(fc);
        }
        //Context ctx = environment.getContext();
        //return ctx.getCharacterDataLoader().loadMany(friendIds);
        return chars;
    };*/
}

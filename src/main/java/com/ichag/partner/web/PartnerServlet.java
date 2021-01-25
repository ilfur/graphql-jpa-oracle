/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ichag.partner.web;

import graphql.kickstart.servlet.GraphQLConfiguration;
import graphql.kickstart.servlet.GraphQLHttpServlet;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import static graphql.schema.idl.TypeRuntimeWiring.newTypeWiring;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author MPFEIFER
 */
@WebServlet(name = "PartnerServlet", urlPatterns = {"graphql/*"}, loadOnStartup = 1)
public class PartnerServlet extends GraphQLHttpServlet {

    @Override
    protected GraphQLConfiguration getConfiguration() {
        return GraphQLConfiguration.with(createSchema()).build();
    }

    private GraphQLSchema createSchema() {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("svipartner.graphqls");
        Reader streamReader = new InputStreamReader(stream);
        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(streamReader);

        RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
                .type(newTypeWiring("Query")
                        .dataFetcher("partner", PartnerWiring.partnerDataFetcher)
                )
                .type(newTypeWiring("Partner")
                        .dataFetcher("komposit", PartnerWiring.kompositDataFetcher)
                        .dataFetcher("kfz", PartnerWiring.kfzDataFetcher)
                        .dataFetcher("rechtschutz", PartnerWiring.rechtschutzDataFetcher)
                        .dataFetcher("schaeden", PartnerWiring.schaedenDataFetcher)
                )
                .build();
        SchemaGenerator schemaGenerator = new SchemaGenerator();
        return schemaGenerator.makeExecutableSchema(typeRegistry, wiring);
    }

}

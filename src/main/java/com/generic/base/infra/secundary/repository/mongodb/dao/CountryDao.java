package com.generic.base.infra.secundary.repository.mongodb.dao;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "countries")
@Data
public class CountryDao {
    @Id
    private String id;
    private String name;
    @Field("code_area")
    private String codeArea;
    private String gmt;
    private String language;
    private String currency;
    @Field("fiscal_identifier_type")
    private String fiscalIdentifierType;
    @Field("code_iso")
    private String codeIso;
}

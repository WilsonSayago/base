package com.generic.base.infra.primary.controllers.dto;

import com.generic.base.core.domains.Country;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CountryDto {
    private String id;
    private String name;
    private String codeArea;
    private String gmt;
    private String language;
    private String currency;
    private String fiscalIdentifierType;
    private String codeIso;

    public static CountryDto toCountryDto(Country country) {
        return new CountryDto(country.id(),
                country.name(),
                country.codeArea(),
                country.gmt(),
                country.language(),
                country.currency(),
                country.fiscalIdentifierType(),
                country.codeIso());
    }
}

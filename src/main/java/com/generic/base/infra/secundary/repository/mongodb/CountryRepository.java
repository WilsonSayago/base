package com.generic.base.infra.secundary.repository.mongodb;

import com.generic.base.core.domains.Country;
import com.generic.base.core.ports.CountryPort;
import com.generic.base.infra.secundary.repository.mongodb.dao.CountryDao;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CountryRepository implements CountryPort {

    private final ICountryRepository repository;

    public CountryRepository(ICountryRepository repository) {
        this.repository = repository;
    }

    public Flux<Country> findAll() {
        return repository.findAll().map(this::fromEntity);
    }

    public Country fromEntity(CountryDao entity) {
        return new Country(entity.getId(), entity.getName(), entity.getCodeArea(), entity.getGmt(), entity.getLanguage(), entity.getCurrency(), entity.getFiscalIdentifierType(), entity.getCodeIso());
    }
}

package com.generic.base.core.services;

import com.generic.base.core.CountryUseCase;
import com.generic.base.core.domains.Country;
import com.generic.base.core.ports.CountryPort;
import reactor.core.publisher.Flux;

public class CountryService implements CountryUseCase {

    private final CountryPort countryPort;

    public CountryService(CountryPort countryPort) {
        this.countryPort = countryPort;
    }
    @Override
    public Flux<Country> findAll() {
        return this.countryPort.findAll();
    }
}

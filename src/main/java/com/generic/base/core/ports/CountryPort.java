package com.generic.base.core.ports;

import com.generic.base.core.domains.Country;
import reactor.core.publisher.Flux;

public interface CountryPort {
    Flux<Country> findAll();
}

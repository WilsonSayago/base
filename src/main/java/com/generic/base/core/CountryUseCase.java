package com.generic.base.core;

import com.generic.base.core.domains.Country;
import reactor.core.publisher.Flux;

public interface CountryUseCase {
    Flux<Country> findAll();
}

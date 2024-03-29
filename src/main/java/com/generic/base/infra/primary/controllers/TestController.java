package com.generic.base.infra.primary.controllers;

import com.generic.base.core.CountryUseCase;
import com.generic.base.core.domains.Country;
import com.generic.base.infra.primary.controllers.dto.CountryDto;
import com.generic.base.infra.secundary.repository.mongodb.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class TestController {

    private final CountryUseCase countryUseCase;

    @GetMapping("/hello")
    public Mono<String> helloWorld() {
        return Mono.just("Hello, Reactive World!");
    }

    @GetMapping("/countries")
    public Flux<CountryDto> getCountries() {
        return  countryUseCase.findAll().map(CountryDto::toCountryDto);
    }
}

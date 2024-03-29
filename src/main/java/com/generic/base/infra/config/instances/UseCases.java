package com.generic.base.infra.config.instances;

import com.generic.base.core.CountryUseCase;
import com.generic.base.core.ports.CountryPort;
import com.generic.base.core.services.CountryService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UseCases {

    @Bean
    public CountryUseCase countryUseCase(CountryPort countryPort) {
        return new CountryService(countryPort);
    }
}

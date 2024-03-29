package com.generic.base.infra.secundary.repository.mongodb;

import com.generic.base.infra.secundary.repository.mongodb.dao.CountryDao;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends ReactiveMongoRepository<CountryDao, String> { }

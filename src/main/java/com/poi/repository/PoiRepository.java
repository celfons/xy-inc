package com.poi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.poi.model.Poi;

@Repository
public interface PoiRepository extends MongoRepository<Poi, String>{
}
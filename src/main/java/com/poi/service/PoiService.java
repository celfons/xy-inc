package com.poi.service;

import java.util.List;

import com.poi.model.Poi;

public interface PoiService {

	Poi create(Poi poi) throws Exception;
	
	List<Poi> findAll() throws Exception;
	
	List<Poi> findByProximity(Integer positionX,Integer positionY,Integer maxRange) throws Exception;
	
}
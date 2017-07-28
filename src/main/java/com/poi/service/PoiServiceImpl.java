package com.poi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.poi.model.Poi;
import com.poi.repository.PoiRepository;

@Service
public class PoiServiceImpl implements PoiService{

	@Autowired
	private PoiRepository repository;

	public Poi create(Poi poi) throws Exception{
		try {
			Assert.notNull(poi, "poi can not be null");
			return repository.save(poi);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<Poi> findAll() throws Exception{
		try {
			List<Poi> pois = repository.findAll();
			Assert.notNull(pois, "pois can not be null");
			
			if(pois != null && pois.size() > 0){
				return pois;
			}
			else{
				return new ArrayList<Poi>();
			}
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<Poi> findByProximity(Integer positionX, Integer positionY, Integer maxRange) throws Exception{

		try {
			
			List<Poi> pois = repository.findAll();
			Assert.notNull(pois, "pois can not be null");
			
			double dPositionX = (double) positionX;
			double dPositionY = (double) positionY;
			double dMax = (double) maxRange;
			
			List<Poi> poisList = new ArrayList<Poi>();
			
			if(pois != null && pois.size() > 0){
				for (Poi poi : pois) {
	
					double poiPositionX = (double) poi.getPositionX();
					double poiPositionY = (double) poi.getPositionY();
	
					double distanceCalculation = Math.hypot(poiPositionX - dPositionX, poiPositionY - dPositionY);
	
					if (distanceCalculation <= dMax) {
						poisList.add(poi);
					}
				}
			}
			return poisList;
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
}
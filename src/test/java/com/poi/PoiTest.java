package com.poi;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.poi.model.Poi;
import com.poi.service.PoiService;

@RunWith(SpringRunner.class)
public class PoiTest {

	@Autowired
	private PoiService service;

	@Test
	public void testNull() throws Exception {
		
		Poi createTest = new Poi("locationName",10, 10);
		service.create(createTest);
		
		List<Poi> pois = service.findAll();
		
		service.findByProximity(1, 1, 10);
	
		
	}

}
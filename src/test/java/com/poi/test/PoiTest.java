package com.poi.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poi.app.Application;
import com.poi.model.Poi;
import com.poi.service.PoiService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
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
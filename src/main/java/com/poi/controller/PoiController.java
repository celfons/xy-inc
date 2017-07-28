package com.poi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poi.model.Poi;
import com.poi.service.PoiService;

@RestController
@RequestMapping(value = "/pois")
public class PoiController {
	
	@Autowired
	private PoiService service;

	@PostMapping
	public Poi create(@RequestBody Poi poi) throws Exception{
		return service.create(poi);
	}

	@GetMapping
	public List<Poi> findAll() throws Exception{
		return service.findAll();
	}
	
	@GetMapping("/findByProximity")
	  public List<Poi> findByProximity(@RequestParam Integer positionX, @RequestParam Integer positionY, @RequestParam Integer maxRange) throws Exception{
	    return service.findByProximity(positionX,positionY,maxRange);
	  }
	
}
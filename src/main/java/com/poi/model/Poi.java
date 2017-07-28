package com.poi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="poi")
public class Poi {

	@Id
	private String id;
	private String name;
	private Integer positionX;
	private Integer positionY;

	public Poi(){
		
	}

	public Poi(String name, Integer positionX, Integer positionY){
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPositionX() {
		return positionX;
	}
	
	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}
	
	public Integer getPositionY() {
		return positionY;
	}
	
	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}

}
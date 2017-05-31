package com.doteva.jukebox.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	public Genre() {}
	
	public Genre(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
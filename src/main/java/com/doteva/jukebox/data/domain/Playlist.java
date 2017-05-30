package com.doteva.jukebox.data.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Playlist {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private List<Tune> list;

	@OneToOne
	private User user;	

	public Playlist() {}
	
	public List<Tune> getList() {
		return list;
	}

	public void setList(List<Tune> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	
}

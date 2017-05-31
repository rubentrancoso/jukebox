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
	private List<Tune> tunes;

	@OneToOne
	private User user;	

	public Playlist() {}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Tune> getTunes() {
		return tunes;
	}

	public void setTunes(List<Tune> tunes) {
		this.tunes = tunes;
	}
	
	

	
}

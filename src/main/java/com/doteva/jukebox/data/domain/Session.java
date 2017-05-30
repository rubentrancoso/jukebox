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
public class Session {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private List<Rank> poll;
	
	@OneToOne
	private User user;

	public Session() {}
	
	public List<Rank> getPoll() {
		return poll;
	}

	public void setPoll(List<Rank> poll) {
		this.poll = poll;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}

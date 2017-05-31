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
	private List<Rank> rank;

	@OneToOne
	private User user;

	public Session() {}

	public List<Rank> getRank() {
		return rank;
	}

	public void setRank(List<Rank> rank) {
		this.rank = rank;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

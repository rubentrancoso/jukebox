package com.doteva.jukebox.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Rank {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	private Tune tune;
	private Long votes;
	
	public Rank() {}
	
	public Tune getTune() {
		return tune;
	}
	public void setTune(Tune tune) {
		this.tune = tune;
	}
	public Long getVotes() {
		return votes;
	}
	public void setVotes(Long votes) {
		this.votes = votes;
	}
	
	
}

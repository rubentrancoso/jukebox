package com.doteva.jukebox.data.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Album {

	@Id
	@GeneratedValue
	private Long id;

	@OneToMany
	private List<Tune> tunes;

	@OneToMany
	private List<Artist> artists;

	private String name;

	private Date releaseYear;

	public Album() {
	}

	public Album(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tune> getTunes() {
		return tunes;
	}

	public void setTunes(List<Tune> tunes) {
		this.tunes = tunes;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public Date getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

}

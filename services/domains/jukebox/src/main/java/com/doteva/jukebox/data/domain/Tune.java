package com.doteva.jukebox.data.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Tune {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Date releaseYear;

	@OneToMany
	private List<Artist> artists;

	@OneToOne
	private Album originalAlbum;

	@OneToMany
	private List<Album> albuns;

	@OneToOne
	private Genre genre;

	public Tune() {
	}

	public Tune(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public Album getOriginalAlbum() {
		return originalAlbum;
	}

	public void setOriginalAlbum(Album originalAlbum) {
		this.originalAlbum = originalAlbum;
	}

	public Date getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<Album> albuns) {
		this.albuns = albuns;
	}

}

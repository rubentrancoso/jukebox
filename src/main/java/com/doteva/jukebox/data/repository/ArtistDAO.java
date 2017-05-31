package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.Artist;

@RestResource(path="artists", rel="artists")
public interface ArtistDAO extends CrudRepository<Artist, Long> {

}

package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.Genre;

@RestResource(path="genres", rel="genres")
public interface GenreDAO extends CrudRepository<Genre, Long> {

}

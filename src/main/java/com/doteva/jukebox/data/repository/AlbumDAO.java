package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.Album;

@RestResource(path="albuns", rel="albuns")
public interface AlbumDAO extends CrudRepository<Album, Long> {

}

package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.Playlist;

@RestResource(path="playlists", rel="playlists")
public interface PlaylistDAO extends CrudRepository<Playlist, Long> {

}

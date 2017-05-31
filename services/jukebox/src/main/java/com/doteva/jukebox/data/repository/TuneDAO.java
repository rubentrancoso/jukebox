package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.Tune;

@RestResource(path="tunes", rel="tunes")
public interface TuneDAO extends CrudRepository<Tune, Long> {

}

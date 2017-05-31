package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.Rank;

@RestResource(path="ranks", rel="ranks")
public interface RankDAO extends CrudRepository<Rank, Long> {

}
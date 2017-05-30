package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.Session;

@RestResource(path="sessions", rel="sessions")
public interface SessionDAO extends CrudRepository<Session, Long> {

}
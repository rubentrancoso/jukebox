package com.doteva.jukebox.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.doteva.jukebox.data.domain.User;

@RestResource(path="users", rel="users")
public interface UserDAO extends CrudRepository<User, Long> {

}

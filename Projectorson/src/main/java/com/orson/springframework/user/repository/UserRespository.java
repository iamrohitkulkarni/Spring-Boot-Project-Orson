package com.orson.springframework.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.orson.springframework.user.model.User;

/**
 * @author Rohit Kulkarni. 19-Dec-2018 Projectorson
 *
 */
@RepositoryRestResource
public interface UserRespository extends JpaRepository<User, Integer> {

}

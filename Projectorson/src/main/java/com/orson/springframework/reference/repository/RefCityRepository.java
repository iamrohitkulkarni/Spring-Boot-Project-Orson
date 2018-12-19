package com.orson.springframework.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.orson.springframework.reference.model.RefCity;

/**
 * @author Rohit Kulkarni. 19-Dec-2018 Projectorson
 *
 */
@RepositoryRestResource
public interface RefCityRepository extends JpaRepository<RefCity, Integer> {

}

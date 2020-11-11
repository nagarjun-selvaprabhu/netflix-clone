package io.nagarjun.repo;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.nagarjun.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>, JpaSpecificationExecutor<Movie> {


	
}

package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.entity.Movie;
//No need of @Repository as JpaRepository is already a Managed Component and hence MovieRepository also
public interface MovieRepository 
extends JpaRepository<Movie, Integer>{
	//No methods are needed as long as just CRUD operations 
	//are to be performed
	//For additional functionality, methods can be declared
}

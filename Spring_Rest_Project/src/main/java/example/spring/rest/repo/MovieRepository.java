package example.spring.rest.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import example.spring.rest.entity.Movie;
import example.spring.rest.store.MovieStore;

@Repository//Marks this class as a repository
public class MovieRepository {
	public Collection<Movie> getAll(){
		return MovieStore.getAll();
		/*Collection<Movie> allMovies = 
		MovieStore.getAll();
		return allMovies;*/
	}
	
	public Movie getById(Integer movieId) {
		return MovieStore.getById(movieId);
	}
	
	public void create(Movie movieObj) {
		MovieStore.create(movieObj);
	}
	public void update(Movie movieObj) {
		MovieStore.update(movieObj);
	}
	
	public void delete(Integer movieId) {
		MovieStore.delete(movieId);
	}
}









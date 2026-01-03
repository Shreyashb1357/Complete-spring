package example.spring.rest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.entity.Movie;
import example.spring.rest.repo.MovieRepository;

@Service//Marks this class as a service
public class MovieService {
	@Autowired
	private MovieRepository movieRepo;
	public Collection<Movie> getAll(){
		Collection<Movie> allMovies =
				movieRepo.getAll();
		return allMovies;
	}
	public Movie getById(Integer movieId) {
		Movie foundMovie = movieRepo.getById(movieId);
		//Business logic if any
		return foundMovie;
	}
	public void create(Movie movieObj) {
		movieRepo.create(movieObj);
	}
	public void update(Movie movieObj) {
		movieRepo.update(movieObj);
	}
	
	public void delete(Integer movieId) {
		movieRepo.delete(movieId);
	}
}









package example.spring.rest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.entity.Movie;
import example.spring.rest.service.MovieService;

@RestController
public class MovieRestController {
	@Autowired
	private MovieService movieServ;
	@GetMapping("/movies")
	public Collection<Movie> getAll(){
		return movieServ.getAll();
	}
	@GetMapping("/movies/{ID}")
	public Movie getById(@PathVariable("ID") Integer movieId) {
		return movieServ.getById(movieId);
	}
	@PostMapping("/movies")
	public void create(@RequestBody Movie movieObj) {
		System.out.println("Received Movie: " + movieObj);
		movieServ.create(movieObj);
	}
	
	@PutMapping("/movies")
	public void update(@RequestBody Movie movieObj) {
		System.out.println("Received Movie: " + movieObj);
		movieServ.update(movieObj);
	}
	
	@DeleteMapping("/movies/{movieId}")
	public void delete(@PathVariable Integer movieId) {
		movieServ.delete(movieId);
	}
}





package example.spring.rest.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import example.spring.rest.entity.Movie;

public class MovieStore {
	private static Map<Integer, Movie> movieMap;
	static {
		movieMap = new HashMap<>();
		Movie m1 = 
		new Movie(101, "Speed", "Thriller", 1997);
		Movie m2 = 
		new Movie(102, "Chhava", "Historical", 2024);
		Movie m3 = 
		new Movie(103, "Sholay", "Action", 1975);
		movieMap.put(m1.getMovieId(), m1);
		movieMap.put(m2.getMovieId(), m2);
		movieMap.put(m3.getMovieId(), m3);		
	}
	public static Collection<Movie> getAll(){
		Collection<Movie> allMovies = movieMap.values();
		return allMovies;
		//return movieMap.values();
	}
	
	public static Movie getById(Integer movieId) {
		Movie foundMovie = movieMap.get(movieId);
		return foundMovie;
	}
	
	public static void create(Movie movieObj) {
		movieMap.put(movieObj.getMovieId(), movieObj);
	}
	
	public static void update(Movie movieObj) {
		movieMap.put(movieObj.getMovieId(), movieObj);
	}
	
	public static void delete(Integer movieId) {
		movieMap.remove(movieId);
	}
	
	
}








package com.ticketnew.theatreags.agsservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketnew.theatreags.agsentity.Movie;
import com.ticketnew.theatreags.agsentity.Theatre;
import com.ticketnew.theatreags.agsrepositary.AgsMovieRepositary;
import com.ticketnew.theatreags.agsrepositary.AgsTheatreRepositary;

@Service
public class AgsTheatreService {

	@Autowired
	private AgsMovieRepositary agsmovierep;
	
	@Autowired
	private AgsTheatreRepositary agstheatrerep;
	
	// 
	public List<Movie> getMovies() {
		List<Movie> movies = agsmovierep.findAll();
		return movies;
	}
	
	public List<Theatre> getTheatres() {
		return agstheatrerep.findAll();
	}
	
	public Movie saveMovie(Movie mov) {
		return agsmovierep.save(mov);
	}
	
	public Theatre saveTheatre(Theatre theatre) {
		return agstheatrerep.save(theatre);
	}
		
	public Movie getMovieById(int movieId) {
		Movie movie = agsmovierep.findById(movieId).orElseThrow(() ->  new RuntimeException("Movie Not Found!"));
		return movie;
	}
	
	public Theatre getTheatreById(int theatreId) {
		Theatre theatre = agstheatrerep.findById(theatreId).orElseThrow(() ->  new RuntimeException("Theatre Not Found!"));
		return theatre;
	}
	
	
	public Theatre deleteTheatre(int theatreId) {
		Theatre theatre = agstheatrerep.findById(theatreId).orElseThrow(() ->  new RuntimeException("Theatre Not Found!"));
		
		agstheatrerep.delete(theatre);
		return theatre;
	}
	

	public Movie deleteMovie(int movieId) {
		Movie movie = agsmovierep.findById(movieId).orElseThrow(() ->  new RuntimeException("Movie Not Found!"));
		
		agsmovierep.delete(movie);
		return movie;
	}

	
}

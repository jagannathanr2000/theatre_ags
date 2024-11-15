package com.ticketnew.theatreags.agscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticketnew.theatreags.agsentity.Movie;
import com.ticketnew.theatreags.agsentity.Theatre;
import com.ticketnew.theatreags.agsservice.AgsTheatreService;

import jakarta.websocket.server.PathParam;

@RestController
public class AgsTheatreController {
	@Autowired
	private AgsTheatreService agsTheatreService;
	

	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getAllmovies()
	{
		List<Movie> movies = agsTheatreService.getMovies();
		return ResponseEntity.ok(movies);
	}

	@GetMapping("/movies/{movieId}")
	public ResponseEntity<Movie> getMovieById(@PathVariable int movieId)
	{
		Movie movie = agsTheatreService.getMovieById(movieId);
		return ResponseEntity.ok(movie);
	}
	
	@GetMapping("/theatres/{theatreId}")
	public ResponseEntity<Theatre> getTheatreId(@PathVariable int theatreId)
	{
		Theatre theatre = agsTheatreService.getTheatreById(theatreId);
		return ResponseEntity.ok(theatre);
	}
	
	@GetMapping("/theatres")
	public ResponseEntity<List<Theatre>> getAllTheatres() {
		
		List<Theatre> theatres = agsTheatreService.getTheatres();
		return ResponseEntity.ok(theatres);
	}
	@PostMapping("/savemovie")
	public ResponseEntity<Movie> saveNewMovie(@RequestBody Movie request) {
		Movie res = agsTheatreService.saveMovie(request);
		return ResponseEntity.ok(res);
	}
	
	
	@PostMapping("/savetheatre")
	public ResponseEntity<Theatre> saveNewMovie(@RequestBody Theatre request) {
		Theatre res = agsTheatreService.saveTheatre(request);
		return ResponseEntity.ok(res);
	}
	
	@DeleteMapping("/theatres/{theatreId}")
	public ResponseEntity<Theatre> deleteTheatre(@PathVariable int theatreId){
		Theatre theatre = agsTheatreService.deleteTheatre(theatreId);
		return ResponseEntity.ok(theatre);
	}
	
	@DeleteMapping("/movies/{movieId}")
	public ResponseEntity<Movie> deleteMovie(@PathVariable int movieId){
		Movie movie = agsTheatreService.deleteMovie(movieId);
		return ResponseEntity.ok(movie);
	}
	
	
	
}

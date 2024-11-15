package com.ticketnew.theatreags.agsrepositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketnew.theatreags.agsentity.Movie;

public interface AgsMovieRepositary extends JpaRepository<Movie, Integer>{

}

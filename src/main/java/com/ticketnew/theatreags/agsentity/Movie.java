package com.ticketnew.theatreags.agsentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ags_movies")
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
	private int movie_id;
    private String movie_name;
    private String movie_lang;
    
    public Movie() {
    	
    }
	public Movie(int movie_id, String movie_name, String movie_lang) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_lang = movie_lang;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_lang() {
		return movie_lang;
	}
	public void setMovie_lang(String movie_lang) {
		this.movie_lang = movie_lang;
	}
    
	   
}
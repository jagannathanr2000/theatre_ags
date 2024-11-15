package com.ticketnew.theatreags.agsentity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ags_theatre")
public class Theatre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
  private int theatre_id;
  private String theatre_name;
  private String theatre_location;
  
  
  
  @OneToOne(targetEntity=AgsScreen.class,cascade=CascadeType.ALL)
  @JoinColumn(name="screen_id",referencedColumnName="screen_id")
  private AgsScreen screen;
  
  
  public Theatre() {}

public Theatre(int theatre_id, String theatre_name, String theatre_location, AgsScreen screen) {
	super();
	this.theatre_id = theatre_id;
	this.theatre_name = theatre_name;
	this.theatre_location = theatre_location;
	this.screen = screen;
}

public int getTheatre_id() {
	return theatre_id;
}

public void setTheatre_id(int theatre_id) {
	this.theatre_id = theatre_id;
}

public String getTheatre_name() {
	return theatre_name;
}

public void setTheatre_name(String theatre_name) {
	this.theatre_name = theatre_name;
}

public String getTheatre_location() {
	return theatre_location;
}

public void setTheatre_location(String theatre_location) {
	this.theatre_location = theatre_location;
}

public AgsScreen getScreen() {
	return screen;
}

public void setScreen(AgsScreen screen) {
	this.screen = screen;
}
 
  
  
}



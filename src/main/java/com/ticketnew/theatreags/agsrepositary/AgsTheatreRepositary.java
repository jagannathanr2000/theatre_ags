package com.ticketnew.theatreags.agsrepositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketnew.theatreags.agsentity.Theatre;

public interface AgsTheatreRepositary extends JpaRepository<Theatre, Integer>{

}

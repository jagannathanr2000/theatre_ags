package com.ticketnew.theatreags.agsrepositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketnew.theatreags.agsentity.AgsScreen;

@Repository
public interface AgsScreenRepository extends JpaRepository<AgsScreen,Integer>{

}

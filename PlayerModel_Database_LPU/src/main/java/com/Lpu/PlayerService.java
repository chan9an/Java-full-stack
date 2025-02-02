package com.Lpu;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	@Autowired
	Player_JPA_Repository pr;
	public PlayerService() {
		
	}
	
	
	public List<PlayerModel> getAllPlayers(){
		return pr.findAll();
	}
	
	public PlayerModel getSinglePlayer(int id) {
		Optional<PlayerModel> pm = this.pr.findById(id);
		if(pm.isPresent()) {
			return pm.get();
		}
		else {
			return null;
		}
	}
	public void savePlayer(PlayerModel p) {
		this.pr.save(p);
	}
	public void deletePlayerById(int id) {
		pr.deleteById(id);
	}
}

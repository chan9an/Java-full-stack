package com.Lpu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class PlayerController {

	@Autowired
	PlayerService ps;
	@GetMapping("/players")
	public List<PlayerModel> showPlayers(){
		return this.ps.getAllPlayers();
	}
	@GetMapping("/player/{id}")
	public PlayerModel getOnePlayer(@PathVariable int id) {
		return this.ps.getSinglePlayer(id);
	}
	@RequestMapping(value="player/save",method = RequestMethod.POST)
	public ResponseEntity<String> savePlayer(@Valid @RequestBody PlayerModel p, BindingResult result) {
		if(result.hasErrors()) {
			return new ResponseEntity<>(result.getAllErrors().toString(),HttpStatus.BAD_REQUEST);
		}
		this.ps.savePlayer(p);
		return new ResponseEntity<>("User created successfully",HttpStatus.OK);
	}
	@PutMapping("player/update")
	public void updatePlayer(@RequestBody PlayerModel p1) {
		this.ps.savePlayer(p1);
	}
	@DeleteMapping("player/delete/{id}")
	public void deletePlayer(@PathVariable int id) {
		this.ps.deletePlayerById(id);
	}
}

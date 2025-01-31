package com.playermodel.playermodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService ps;

    @GetMapping
    public List<PlayerModel> getAllPlayers() {
        return ps.getPlayers();
    }


    @GetMapping("/player/{id}")
    public PlayerModel getOnePlayer(@PathVariable int id){
        return this.ps.getSinglePlayer(id);
    }
}

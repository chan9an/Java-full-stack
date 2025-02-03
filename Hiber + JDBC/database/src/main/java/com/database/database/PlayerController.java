package com.database.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public PlayerModel getOnePlayer(@PathVariable int id) {
        return this.ps.getSinglePlayer(id);
    }

    @PostMapping("/save")
    public void addPlayer(@RequestBody List<PlayerModel> pl) { 
        for(PlayerModel ppModel : pl) {
            this.ps.savePlayer(ppModel);
        }
    }
    @PutMapping("/update")
    public void updatePlayer(@RequestBody PlayerModel p1){
        this.ps.updatePlayerService(p1);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable int id){
        this.ps.deletePlayer(id);
    }
    


}


package com.database.database;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    private List<PlayerModel> list = new ArrayList<>();

    public PlayerService() {
        list.add(new PlayerModel(101, "Sachin Tendulkar"));
        list.add(new PlayerModel(102, "Virat Kohli"));
        list.add(new PlayerModel(103, "MS Dhoni"));
        list.add(new PlayerModel(104, "Hardik Pandya"));
    }

    public List<PlayerModel> getPlayers() {
        return list;
    }

    public PlayerModel getSinglePlayer(int id) {
        return list.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void savePlayer(PlayerModel p) {
        list.add(p);
    }

    public void updatePlayerService(PlayerModel p1) {
        for(PlayerModel p : list){
            if(p.getId() == p1.id){
                p.setName((p1.getName()));
            }
        }
    }

    public void deletePlayer(int p1) {
       for(PlayerModel p : list){
        if(p.getId()== p1){
            list.remove(p);
            break;

        }
       }
    }
}


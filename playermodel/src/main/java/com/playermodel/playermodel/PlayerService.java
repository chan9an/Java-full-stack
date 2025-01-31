package com.playermodel.playermodel;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

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
        for(PlayerModel p : list){
            if (p.getId()==id) {
                return p;
                
            }
        }
        return null;
    }
}

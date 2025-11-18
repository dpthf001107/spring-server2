package site.aifixr.api.soccer.player;

import java.util.List;

public interface PlayerService {

    public void save(PlayerModel player);
    public void saveAll(List<PlayerModel> players);
    public void update(PlayerModel player);
    public void delete(String playerId);
    public void findById(String playerId);
    public void findAll();
    public List<PlayerModel> searchByKeyword(String keyword);
    
}
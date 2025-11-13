package site.esgaida.api.soccer.player;

import java.util.List;

import site.esgaida.api.soccer.common.Messenger;
import site.esgaida.api.soccer.player.PlayerDTO;

public interface PlayerService {

    Messenger save(PlayerDTO player);
    Messenger saveAll(List<PlayerDTO> players);
    Messenger update(PlayerDTO player);
    Messenger delete(String playerId);
    Messenger findById(String playerId);
    Messenger findAll();
    
}
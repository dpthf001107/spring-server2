package site.esgaida.api.soccer.player;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.soccer.common.Messenger;
import site.esgaida.api.soccer.player.PlayerDTO;
import site.esgaida.api.soccer.player.PlayerRepository;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{
    
    private final PlayerRepository playerRepository ;

    @Override
    public Messenger save(PlayerDTO player) {
        return playerRepository.save(player);
    }

    @Override
    public Messenger saveAll(List<PlayerDTO> players) {
        return playerRepository.saveAll(players);
    }

    @Override
    public Messenger update(PlayerDTO player) {
        return playerRepository.update(player);
    }

    @Override
    public Messenger delete(String playerId) {
        return playerRepository.delete(playerId);
    }

    @Override
    public Messenger findById(String playerId) {
        return playerRepository.findById(playerId);
    }

    @Override
    public Messenger findAll() {
        return playerRepository.findAll();
    }
    

}
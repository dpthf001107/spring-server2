package site.esgaida.api.soccer.player;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    
    private final PlayerRepository playerRepository;
    
    @Override
    public void save(PlayerModel player) {
        // TODO: 구현 필요
    }

    @Override
    public void saveAll(List<PlayerModel> players) {
        // TODO: 구현 필요
    }

    @Override
    public void update(PlayerModel player) {
        // TODO: 구현 필요
    }

    @Override
    public void delete(String playerId) {
        // TODO: 구현 필요
    }

    @Override
    public void findById(String playerId) {
        // TODO: 구현 필요
    }

    @Override
    public void findAll() {
        // TODO: 구현 필요
    }

    @Override
    public List<PlayerModel> searchByKeyword(String keyword) {
        List<Player> players = playerRepository.findAll().stream()
            .filter(player -> 
                (player.getPlayerName() != null && player.getPlayerName().contains(keyword)) ||
                (player.getEPlayerName() != null && player.getEPlayerName().contains(keyword)) ||
                (player.getNickname() != null && player.getNickname().contains(keyword)) ||
                (player.getPosition() != null && player.getPosition().contains(keyword)) ||
                (player.getNation() != null && player.getNation().contains(keyword))
            )
            .collect(Collectors.toList());
        
        return players.stream()
            .map(this::toPlayerModel)
            .collect(Collectors.toList());
    }
    
    private PlayerModel toPlayerModel(Player player) {
        return PlayerModel.builder()
            .playerId(player.getPlayerUk())
            .playerName(player.getPlayerName())
            .ePlayerName(player.getEPlayerName())
            .nickname(player.getNickname())
            .joinYyyy(player.getJoinYyyy())
            .position(player.getPosition())
            .backNo(player.getBackNo())
            .nation(player.getNation())
            .birthDate(player.getBirthDate() != null ? player.getBirthDate().toString() : null)
            .solar(player.getSolar())
            .height(player.getHeight())
            .weight(player.getWeight())
            .teamId(player.getTeamUk())
            .build();
    }

}

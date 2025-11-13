package site.esgaida.api.soccer.player;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.esgaida.api.soccer.common.Messenger;
import site.esgaida.api.soccer.player.PlayerDTO;
import site.esgaida.api.soccer.player.PlayerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor //파이프라인 연결
@RequestMapping("/players") //HTML에서 들어왔고, 이제 PLAYERS라는 테이블로 갈거야. 종착지를 명시하는 것
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("")
    public Messenger save(PlayerDTO player) { 
        return playerService.save(player);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<PlayerDTO> players) {
        return playerService.saveAll(players);
        
    }

    @PutMapping("/{playerId}")
    public Messenger update(PlayerDTO player) {
        return playerService.update(player);
    }

    @DeleteMapping("/{playerId}")
    public Messenger delete(String playerId) {
        return playerService.delete(playerId);
    }

    @GetMapping("/player/{playerId}")
    public Messenger findById(String playerId) {
        return playerService.findById(playerId);
    }

    @GetMapping("")
    public Messenger findAll() {
        return playerService.findAll();
    }
    

}
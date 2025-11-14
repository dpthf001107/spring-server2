package site.esgaida.api.soccer.player;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.esgaida.api.soccer.common.Messenger;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor //파이프라인 연결
@RequestMapping("/players") //HTML에서 들어왔고, 이제 PLAYERS라는 테이블로 갈거야. 종착지를 명시하는 것
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("")
    public Messenger save(PlayerModel player) { 
         playerService.save(player);
         return null;
    }

    @PostMapping("/all")
    public Messenger saveAll(List<PlayerModel> players) {
        playerService.saveAll(players);
        return null;
        
    }

    @PutMapping("/{playerId}")
    public Messenger update(PlayerModel player) {
        playerService.update(player);
        return null;
    }

    @DeleteMapping("/{playerId}")
    public Messenger delete(String playerId) {
        playerService.delete(playerId);
        return null;
    }

    @GetMapping("/player/{playerId}")
    public Messenger findById(String playerId) {
        playerService.findById(playerId);
        return null;
    }

    @GetMapping("")
    public Messenger findAll() {
        playerService.findAll();
        return null;
    }
    

}
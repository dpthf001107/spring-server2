package site.aifixr.api.soccer.player;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.aifixr.api.soccer.common.Messenger;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor //?Œì´?„ë¼???°ê²°
@RequestMapping("/players") //HTML?ì„œ ?¤ì–´?”ê³ , ?´ì œ PLAYERS?¼ëŠ” ?Œì´ë¸”ë¡œ ê°ˆê±°?? ì¢…ì°©ì§€ë¥?ëª…ì‹œ?˜ëŠ” ê²?
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

    @GetMapping("/search")
    public Messenger search(@RequestParam(required = false) String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return Messenger.builder()
                .code(400)
                .message("ê²€?‰ì–´ë¥??…ë ¥?´ì£¼?¸ìš”")
                .data(null)
                .build();
        }
        
        List<PlayerModel> players = playerService.searchByKeyword(keyword.trim());
        return Messenger.builder()
            .code(200)
            .message("ê²€???„ë£Œ")
            .data(players)
            .build();
    }

}
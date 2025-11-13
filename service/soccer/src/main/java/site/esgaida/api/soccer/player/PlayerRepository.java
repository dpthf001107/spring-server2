
package site.esgaida.api.soccer.player;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.esgaida.api.soccer.common.Messenger;


@Repository
public class PlayerRepository {

    
    public Messenger save(PlayerDTO player) {
        return Messenger.builder()
                .code(200)
                .message("Player saved successfully")
                .build();
    }

    
    public Messenger saveAll(List<PlayerDTO> players) {
        return Messenger.builder()
                .code(200)
                .message("Player saved successfully")
                .build();
    }

    
    public Messenger update(PlayerDTO player) {
        return Messenger.builder()
                .code(200)
                .message("Player updated successfully")
                .build();
    }

    
    public Messenger delete(String playerId) {
        return Messenger.builder()
                .code(200)
                .message("Player deleted successfully")
                .build();
    }

    
    public Messenger findById(String playerId) {
        return Messenger.builder()
                .code(200)
                .message("Player found successfully")
                .build();
    }

    
    public Messenger findAll() {
        return Messenger.builder()
                .code(200)
                .message("Player found successfully")
                .build();
    }


    

}

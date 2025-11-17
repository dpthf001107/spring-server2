package site.esgaida.api.soccer.team;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import site.esgaida.api.soccer.common.Messenger;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
    
    @Override
    public Messenger save(TeamModel team) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger saveAll(java.util.List<TeamModel> teams) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger update(TeamModel team) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger delete(String teamId) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger findById(String teamId) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger findAll() {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }
}

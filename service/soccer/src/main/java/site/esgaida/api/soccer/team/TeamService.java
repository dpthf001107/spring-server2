package site.esgaida.api.soccer.team;

import java.util.List;

import site.esgaida.api.soccer.common.Messenger;

public interface TeamService {

    Messenger save(TeamModel team);
    Messenger saveAll(List<TeamModel> teams);
    Messenger update(TeamModel team);
    Messenger delete(String teamId);
    Messenger findById(String teamId);
    Messenger findAll();
    
}

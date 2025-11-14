package site.esgaida.api.soccer.stadium;

import java.util.List;

import site.esgaida.api.soccer.common.Messenger;

public interface StadiumService {

    Messenger save(StadiumModel stadium);
    Messenger saveAll(List<StadiumModel> stadiums);
    Messenger update(StadiumModel stadium);
    Messenger delete(String stadiumId);
    Messenger findById(String stadiumId);
    Messenger findAll();
    
}

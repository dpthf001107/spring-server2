package site.aifixr.api.soccer.stadium;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import site.aifixr.api.soccer.common.Messenger;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService {
    
    @Override
    public Messenger save(StadiumModel stadium) {
        // TODO: 구현 ?�요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger saveAll(java.util.List<StadiumModel> stadiums) {
        // TODO: 구현 ?�요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger update(StadiumModel stadium) {
        // TODO: 구현 ?�요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger delete(String stadiumId) {
        // TODO: 구현 ?�요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger findById(String stadiumId) {
        // TODO: 구현 ?�요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger findAll() {
        // TODO: 구현 ?�요
        return Messenger.builder().message("Not implemented").build();
    }
}

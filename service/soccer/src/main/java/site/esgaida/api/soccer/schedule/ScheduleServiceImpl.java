package site.esgaida.api.soccer.schedule;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import site.esgaida.api.soccer.common.Messenger;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    
    @Override
    public Messenger save(ScheduleModel schedule) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger saveAll(java.util.List<ScheduleModel> schedules) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger update(ScheduleModel schedule) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger delete(String scheDate) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger findById(String scheDate) {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }

    @Override
    public Messenger findAll() {
        // TODO: 구현 필요
        return Messenger.builder().message("Not implemented").build();
    }
}


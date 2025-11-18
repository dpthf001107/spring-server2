package site.aifixr.api.soccer.schedule;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.aifixr.api.soccer.common.Messenger;

@Repository
public class ScheduleRepository {

    
    public Messenger save(ScheduleModel schedule) {
        return Messenger.builder()
                .code(200)
                .message("Schedule saved successfully")
                .build();
    }

    
    public Messenger saveAll(List<ScheduleModel> schedules) {
        return Messenger.builder()
                .code(200)
                .message("Schedule saved successfully")
                .build();
    }

    
    public Messenger update(ScheduleModel schedule) {
        return Messenger.builder()
                .code(200)
                .message("Schedule updated successfully")
                .build();
    }

    
    public Messenger delete(String scheDate) {
        return Messenger.builder()
                .code(200)
                .message("Schedule deleted successfully")
                .build();
    }

    
    public Messenger findById(String scheDate) {
        return Messenger.builder()
                .code(200)
                .message("Schedule found successfully")
                .build();
    }

    
    public Messenger findAll() {
        return Messenger.builder()
                .code(200)
                .message("Schedule found successfully")
                .build();
    }


    

}

package site.esgaida.api.soccer.schedule;

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
@RequestMapping("/schedules") //HTML에서 들어왔고, 이제 SCHEDULES라는 테이블로 갈거야. 종착지를 명시하는 것
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("")
    public Messenger save(ScheduleModel schedule) { 
        return scheduleService.save(schedule);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<ScheduleModel> schedules) {
        return scheduleService.saveAll(schedules);
        
    }

    @PutMapping("/{scheDate}")
    public Messenger update(ScheduleModel schedule) {
        return scheduleService.update(schedule);
    }

    @DeleteMapping("/{scheDate}")
    public Messenger delete(String scheDate) {
        return scheduleService.delete(scheDate);
    }

    @GetMapping("/schedule/{scheDate}")
    public Messenger findById(String scheDate) {
        return scheduleService.findById(scheDate);
    }

    @GetMapping("")
    public Messenger findAll() {
        return scheduleService.findAll();
    }
    

}

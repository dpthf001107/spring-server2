package site.aifixr.api.soccer.stadium;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.aifixr.api.soccer.common.Messenger;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor //?�이?�라???�결
@RequestMapping("/stadiums") //HTML?�서 ?�어?�고, ?�제 STADIUMS?�는 ?�이블로 갈거?? 종착지�?명시?�는 �?public class StadiumController {
public class StadiumController {

    private final StadiumService stadiumService;

    @PostMapping("")
    public Messenger save(StadiumModel stadium) { 
        return stadiumService.save(stadium);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<StadiumModel> stadiums) {
        return stadiumService.saveAll(stadiums);
        
    }

    @PutMapping("/{stadiumId}")
    public Messenger update(StadiumModel stadium) {
        return stadiumService.update(stadium);
    }

    @DeleteMapping("/{stadiumId}")
    public Messenger delete(String stadiumId) {
        return stadiumService.delete(stadiumId);
    }

    @GetMapping("/stadium/{stadiumId}")
    public Messenger findById(String stadiumId) {
        return stadiumService.findById(stadiumId);
    }

    @GetMapping("")
    public Messenger findAll() {
        return stadiumService.findAll();
    }
    

}

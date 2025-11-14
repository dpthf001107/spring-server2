package site.esgaida.api.soccer.stadium;

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
@RequestMapping("/stadiums") //HTML에서 들어왔고, 이제 STADIUMS라는 테이블로 갈거야. 종착지를 명시하는 것
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

package site.aifixr.api.soccer.team;

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
@RequestMapping("/teams") //HTML?�서 ?�어?�고, ?�제 TEAMS?�는 ?�이블로 갈거?? 종착지�?명시?�는 �?public class TeamController {
public class TeamController {

    private final TeamService teamService;

    @PostMapping("")
    public Messenger save(TeamModel team) { 
        return teamService.save(team);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<TeamModel> teams) {
        return teamService.saveAll(teams);
        
    }

    @PutMapping("/{teamId}")
    public Messenger update(TeamModel team) {
        return teamService.update(team);
    }

    @DeleteMapping("/{teamId}")
    public Messenger delete(String teamId) {
        return teamService.delete(teamId);
    }

    @GetMapping("/team/{teamId}")
    public Messenger findById(String teamId) {
        return teamService.findById(teamId);
    }

    @GetMapping("")
    public Messenger findAll() {
        return teamService.findAll();
    }
    

}

package site.aifixr.api.soccer.stadium;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import site.aifixr.api.soccer.schedule.Schedule;
import site.aifixr.api.soccer.team.Team;

@Data
@Entity //MAPPING ?ëµ
@Table(name = "stadiums") //?Œì´ë¸”ëª… ë§¤í•‘
public class Stadium {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //long ?€ ê¸??«ìë¥??˜ë???    private String stadiumUk;
    private String stadiumName;
    private String hometeamUk;
    private Integer seatCount;
    private String address;
    private String ddd;
    private String tel;

    @OneToMany(mappedBy = "stadium")
    private List<Team> teams;

    @OneToMany(mappedBy = "stadium")
    private List<Schedule> schedules;
}

package site.esgaida.api.soccer.stadium;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import site.esgaida.api.soccer.schedule.Schedule;
import site.esgaida.api.soccer.team.Team;

@Data
@Entity //MAPPING 생략
@Table(name = "stadiums") //테이블명 매핑
public class Stadium {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //long 은 긴 숫자를 의미함
    private String stadiumUk;
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

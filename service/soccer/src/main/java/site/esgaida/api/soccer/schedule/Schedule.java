package site.esgaida.api.soccer.schedule;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import site.esgaida.api.soccer.stadium.Stadium;
import site.esgaida.api.soccer.team.Team;


@Data
@Entity //MAPPING 생략
@Table(name = "schedules") //테이블명 매핑
public class Schedule {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //long 은 긴 숫자를 의미함
    private String scheDate;
    private String stadiumUk;
    private String gubun;
    private String hometeamUk;
    private String awayteamUk;
    private Integer homeScore;
    private Integer awayScore;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;
}

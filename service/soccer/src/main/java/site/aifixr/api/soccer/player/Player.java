package site.aifixr.api.soccer.player;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import site.aifixr.api.soccer.team.Team;

import java.time.LocalDate;

@Data
@Entity //MAPPING ?ëµ
@Table(name = "players") //?Œì´ë¸”ëª… ë§¤í•‘
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //long ?€ ê¸??«ìë¥??˜ë???
    private String playerUk;
    private String playerName;
    private String ePlayerName;
    private String nickname;
    private String joinYyyy;
    private String position;
    private Integer backNo;
    private String nation;
    private LocalDate birthDate;
    private String solar;
    private Integer height;
    private Integer weight;
    private String teamUk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;
}
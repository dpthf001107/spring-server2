package site.esgaida.api.soccer.team;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import site.esgaida.api.soccer.player.Player;
import site.esgaida.api.soccer.stadium.Stadium;

@Data
@Entity //MAPPING 생략
@Table(name = "teams") //테이블명 매핑
public class Team {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //long 은 긴 숫자를 의미함
    private String teamUk;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYyyy;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;
    private String stadiumUk;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    @ManyToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;
    
}

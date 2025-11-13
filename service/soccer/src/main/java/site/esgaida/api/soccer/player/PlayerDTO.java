package site.esgaida.api.soccer.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data               // getter, setter, toString, equals, hashCode 자동 생성
@NoArgsConstructor  // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 포함한 생성자 자동 생성

public class PlayerDTO {
    private String playerId;
    private String playerName;
    private String ePlayerName;
    private String nickname;
    private String joinYyyy;
    private String position;
    private Integer backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private Integer height;
    private Integer weight;
    private String teamId;
}
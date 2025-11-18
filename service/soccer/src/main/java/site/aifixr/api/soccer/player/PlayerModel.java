package site.aifixr.api.soccer.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data               // getter, setter, toString, equals, hashCode ?ë™ ?ì„±
@NoArgsConstructor  // ê¸°ë³¸ ?ì„±???ë™ ?ì„±
@AllArgsConstructor // ëª¨ë“  ?„ë“œë¥??¬í•¨???ì„±???ë™ ?ì„±

public class PlayerModel {
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
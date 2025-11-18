package site.aifixr.api.soccer.schedule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data               // getter, setter, toString, equals, hashCode ?ë™ ?ì„±
@NoArgsConstructor  // ê¸°ë³¸ ?ì„±???ë™ ?ì„±
@AllArgsConstructor // ëª¨ë“  ?„ë“œë¥??¬í•¨???ì„±???ë™ ?ì„±

public class ScheduleModel {
    private String scheDate;
    private String stadiumId;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private Integer homeScore;
    private Integer awayScore;
}


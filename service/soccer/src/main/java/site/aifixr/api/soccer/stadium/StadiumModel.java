package site.aifixr.api.soccer.stadium;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data               // getter, setter, toString, equals, hashCode ?ë™ ?ì„±
@NoArgsConstructor  // ê¸°ë³¸ ?ì„±???ë™ ?ì„±
@AllArgsConstructor // ëª¨ë“  ?„ë“œë¥??¬í•¨???ì„±???ë™ ?ì„±

public class StadiumModel {
    private String stadiumId;
    private String stadiumName;
    private String hometeamId;
    private Integer seatCount;
    private String address;
    private String ddd;
    private String tel;
}


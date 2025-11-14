package site.esgaida.api.soccer.schedule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data               // getter, setter, toString, equals, hashCode 자동 생성
@NoArgsConstructor  // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 포함한 생성자 자동 생성

public class ScheduleModel {
    private String scheDate;
    private String stadiumId;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private Integer homeScore;
    private Integer awayScore;
}


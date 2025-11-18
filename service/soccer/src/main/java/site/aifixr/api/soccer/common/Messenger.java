package site.aifixr.api.soccer.common;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Messenger {
    private int code;
    private String message;
    private Object data;
}
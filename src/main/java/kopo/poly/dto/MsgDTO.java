package kopo.poly.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // 변수에 값이 변할때만 포함한다
public class MsgDTO {

    private int result; // 성공 : 1 / 실패 : 그 외
    private String msg; // 메시지
}

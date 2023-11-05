package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeocodeAPIDTO {

    //API로 부터 받을 X좌표(경도) 와 Y좌표(위도)
    private String x;
    private String y;
}

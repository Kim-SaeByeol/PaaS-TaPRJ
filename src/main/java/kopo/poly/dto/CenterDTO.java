package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CenterDTO {

    private String seq; // 순번

    private String region; // 지역

    private String centerName; // 센터명

    private String address; // 주소

    private String contact; // 담당 연락처


    /**
     * 해당 DTO는 Center의 정보를 DB에 저장할 DTO
     * Insert는 총 2개가 존재하여 데이터를 각각 넣게 될 것임
     * 하나는 관리자가 기본적으로 넣을 수 있는 지역, 센터명, 주소, 담당 연락처이고,
     * 하나는 Geocode API 를 통해 얻은 경도와 위도를 추가하는 Insert임.
     * + SEQ는 매번 조회시마다
     */
}

package kopo.poly.mapper;

import kopo.poly.dto.CenterDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICenterMapper {

    //센터의 전체 리스트
    List<CenterDTO> getCenterList() throws Exception;

    /**
     * 관리자가 추가할 정보는
     * 지역, 센터명, 주소, 연락처 밖에 없음.
     * DTO 에 남은 나머지 SEQ(순번)은 Index로 관리할거고
     * Hardness(경도) 와 Latitude(위도)는 geocodeAPI 로 정보를 받아 따로 저장할 것임.
     *
     * @param pDTO
     * @throws Exception
     */
    void insertCenterInfo(CenterDTO pDTO) throws Exception;



    //센터리스트의 정보 수정
    void updateCenterList(CenterDTO pDTO) throws Exception;

    //센터리스트의 정보 삭제
    void deleteCenterList(CenterDTO pDTO) throws Exception;
}

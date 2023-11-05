package kopo.poly.mapper;

import kopo.poly.dto.CenterDTO;

public interface IGeocodeAPIMapper {

    /**
     * Geocode API를 호출하여 주소에 대한 경도와 위도 정보를 가져와
     * DTO에 설정하고 데이터베이스를 업데이트
     *
     * @param pDTO Geocode 정보를 업데이트할 DTO
     * @throws Exception
     */
    void updateGeocodeInfo(CenterDTO pDTO) throws Exception;

}

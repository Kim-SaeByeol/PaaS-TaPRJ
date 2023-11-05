package kopo.poly.service;

import kopo.poly.dto.CenterDTO;

import java.util.List;

public interface ICenterService {

    List<CenterDTO> getCenterList(String selectedRegion) throws Exception;

    void insertCenterInfo(CenterDTO centerDTO);

    void updateCenterList(CenterDTO centerDTO);

    void deleteCenterList(CenterDTO centerDTO);
}

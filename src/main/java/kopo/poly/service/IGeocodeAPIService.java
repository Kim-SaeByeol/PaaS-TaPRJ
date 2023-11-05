package kopo.poly.service;

import kopo.poly.dto.GeocodeAPIDTO;

public interface IGeocodeAPIService {

    GeocodeAPIDTO callGeocodeApi(String query, String coordinate, String apiKeyId, String apiKey) throws Exception;

}

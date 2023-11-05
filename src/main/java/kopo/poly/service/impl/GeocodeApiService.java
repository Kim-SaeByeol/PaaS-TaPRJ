package kopo.poly.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import kopo.poly.dto.GeocodeAPIDTO;
import kopo.poly.service.IGeocodeAPIService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class GeocodeApiService implements IGeocodeAPIService {

    @Override
    public GeocodeAPIDTO callGeocodeApi(String query, String coordinate, String apiKeyId, String apiKey) throws Exception {
        String apiUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode";
        String fullUrl = apiUrl + "?query=" + query + "&coordinate=" + coordinate;

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(fullUrl);

        // 헤더 설정
        request.setHeader("X-NCP-APIGW-API-KEY-ID", apiKeyId);
        request.setHeader("X-NCP-APIGW-API-KEY", apiKey);

        // API 호출 및 응답 처리
        HttpResponse response = client.execute(request);
        String jsonResponse = EntityUtils.toString(response.getEntity());

        // JSON 파싱 및 응답 객체 반환
        return parseJsonResponse(jsonResponse, GeocodeAPIDTO.class);
    }

    // JSON 응답을 객체로 파싱하는 메서드 (Jackson 라이브러리 사용)
    private <T> T parseJsonResponse(String jsonResponse, Class<T> responseType) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonResponse, responseType);
    }
    }
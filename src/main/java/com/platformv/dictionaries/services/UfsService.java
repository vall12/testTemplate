//package com.platformv.dictionaries.services;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class UfsService {
//
//    @Value("${ufs.provider.url}")
//    private String ufsProviderUrl;
//
//    public <TResponse> TResponse get(String endpoint, Class<TResponse> responseClass) {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<TResponse> result = restTemplate.exchange(ufsProviderUrl + "/" + endpoint,
//                HttpMethod.GET, null, responseClass);
//        return result.getBody();
//    }
//
//    public <TResponse, TRequest> TResponse post(String endpoint, TRequest request, Class<TResponse> responseClass) {
//        HttpEntity httpEntity = new HttpEntity(request);
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<TResponse> result = restTemplate.postForEntity(ufsProviderUrl + "/" + endpoint, httpEntity, responseClass);
//        return result.getBody();
//    }
//
//    public <TRequest> void post(String endpoint, TRequest request) {
//        HttpEntity httpEntity = new HttpEntity(request);
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.postForEntity(ufsProviderUrl + "/" + endpoint, httpEntity, Void.class);
//    }
//
//    public <TRequest> void put(String endpoint, TRequest request) {
//        HttpEntity httpEntity = new HttpEntity(request);
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.exchange(ufsProviderUrl + "/" + endpoint, HttpMethod.PUT, httpEntity, Void.class);
//    }
//
//    public void delete(String endpoint) {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.exchange(ufsProviderUrl + "/" + endpoint, HttpMethod.DELETE, null, Void.class);
//    }
//
//    public <TResponse> TResponse get(String endpoint, HttpHeaders headers, Class<TResponse> responseClass) {
//        HttpEntity httpEntity = new HttpEntity(headers);
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<TResponse> result = restTemplate.exchange(ufsProviderUrl + "/" + endpoint,
//                HttpMethod.GET, httpEntity, responseClass);
//        return result.getBody();
//    }
//
//    public <TResponse, TRequest> TResponse post(String endpoint, TRequest request, HttpHeaders headers, Class<TResponse> responseClass) {
//        HttpEntity httpEntity = new HttpEntity(request, headers);
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<TResponse> result = restTemplate.postForEntity(ufsProviderUrl + "/" + endpoint, httpEntity, responseClass);
//        return result.getBody();
//    }
//
//    public <TRequest> void post(String endpoint, TRequest request, HttpHeaders headers) {
//        HttpEntity httpEntity = new HttpEntity(request, headers);
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.postForEntity(ufsProviderUrl + "/" + endpoint, httpEntity, Void.class);
//    }
//
//    public <TRequest> void put(String endpoint, TRequest request, HttpHeaders headers) {
//        HttpEntity httpEntity = new HttpEntity(request, headers);
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.exchange(ufsProviderUrl + "/" + endpoint, HttpMethod.PUT, httpEntity, Void.class);
//    }
//
//    public void delete(String endpoint, HttpHeaders headers) {
//        HttpEntity httpEntity = new HttpEntity(headers);
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.exchange(ufsProviderUrl + "/" + endpoint, HttpMethod.DELETE, httpEntity, Void.class);
//    }
//
//
//}

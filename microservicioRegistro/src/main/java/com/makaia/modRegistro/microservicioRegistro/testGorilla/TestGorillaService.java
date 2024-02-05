package com.makaia.modRegistro.microservicioRegistro.testGorilla;

import com.makaia.modRegistro.microservicioRegistro.Entities.ResultadosTestGorilla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TestGorillaService  {

    private final RestTemplate restTemplate;

    @Autowired
    public TestGorillaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // End-point de testGorilla
    @Value("${testGorillaUrl}")
    private String testGorillaUrl;

    // End-point del token imitador
    @Value("-H Authorization: Token YOUR_FAKE_TOKEN")
    private String testGorillaApiToken;

    public InvitationResponseDTO inviteCandidate(String assessmentId, InvitationRequestDTO invitationRequest) {
        String url = testGorillaUrl + "/assessments/" + assessmentId + "/invite_candidate/";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "Token " + testGorillaApiToken);

        HttpEntity<InvitationRequestDTO> requestEntity = new HttpEntity<>(invitationRequest, headers);

        ResponseEntity<InvitationResponseDTO> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                InvitationResponseDTO.class
        );
        return responseEntity.getBody();
    }

    public List<TestGorillaCandidateDTO> getInvitedCandidates(String assessmentId) {
        String url = testGorillaUrl + "/assessments/candidature/?assessment=" + assessmentId;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Token " + testGorillaApiToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<TestGorillaCandidateDTO> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                TestGorillaCandidateDTO.class
        );

        return Arrays.asList(response.getBody());
    }

    public List<TestGorillaResultDTO> getAssessmentResults(String assessmentId, ResultadosTestGorilla testTakerId) {
        String url = testGorillaUrl + "/assessments/results/?candidature__assessment=" + assessmentId
                + "&candidature__test_taker=" + testTakerId;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Token " + testGorillaApiToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<TestGorillaResultDTO[]> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                TestGorillaResultDTO[].class
        );

        TestGorillaResultDTO[] resultsArray = response.getBody();
        if (resultsArray != null) {
            return Arrays.asList(resultsArray);
        } else {
            return Collections.emptyList();
        }
    }
}
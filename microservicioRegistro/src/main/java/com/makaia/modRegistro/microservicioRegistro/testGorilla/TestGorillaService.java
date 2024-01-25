package com.makaia.modRegistro.microservicioRegistro.testGorilla;

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
public class TestGorillaService {

    private final RestTemplate restTemplate;

    @Autowired
    public TestGorillaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // End-point para invitar a un aspirante por correo
    @Value("${https://app.testgorilla.com/api}")
    private String emailInvitationUrl;

    // End-point para listar candidatos invitados
    @Value("${https://app.testgorilla.com/api}")
    private String listCandidatesUrl;

    // End-point para recibir resultados de los aspirantes
    @Value("${https://app.testgorilla.com/api}")
    private String testResultUrl;

    // End-point del token imitador
    @Value("-H Authorization: Token YOUR_FAKE_TOKEN")
    private String testGorillaApiToken;

    public InvitationResponse inviteCandidate(String assessmentId, InvitationRequest invitationRequest) {
        String url = emailInvitationUrl + "/assessments/" + assessmentId + "/invite_candidate/";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "Token " + testGorillaApiToken);

        HttpEntity<InvitationRequest> requestEntity = new HttpEntity<>(invitationRequest, headers);

        ResponseEntity<InvitationResponse> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                InvitationResponse.class
        );
        return responseEntity.getBody();
    }

    public List<TestGorillaCandidateDTO> getInvitedCandidates(String assessmentId) {
        String url = listCandidatesUrl + "/assessments/candidature/?assessment=" + assessmentId;

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

    public List<TestGorillaResultDTO> getAssessmentResults(String assessmentId, String testTakerId) {
        String url = testResultUrl + "/assessments/results/?candidature__assessment=" + assessmentId
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
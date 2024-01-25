package com.makaia.modRegistro.microservicioRegistro.testGorilla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    @Value("${https://app.testgorilla.com/api}")
    private String listCandidatesUrl;

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


}
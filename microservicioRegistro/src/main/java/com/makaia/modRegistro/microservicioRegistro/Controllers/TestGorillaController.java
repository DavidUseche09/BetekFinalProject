package com.makaia.modRegistro.microservicioRegistro.Controllers;

import com.makaia.modRegistro.microservicioRegistro.Entities.ResultadosTestGorilla;
import com.makaia.modRegistro.microservicioRegistro.testGorilla.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/testGorilla")
@Validated
public class TestGorillaController {
    @Autowired
    TestGorillaService testGorillaService;
    @PostMapping("/invitarCandidato/{assessmentId}")
    public ResponseEntity<InvitationResponse> inviteCandidate(
            @PathVariable String assessmentId,
            @RequestBody InvitationRequest invitationRequest) {

        try {
            InvitationResponse response = testGorillaService.inviteCandidate(assessmentId, invitationRequest);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/pruebas/{assessmentId}/candidatosInvitados")
    public ResponseEntity<List<TestGorillaCandidateDTO>> getInvitedCandidates(@PathVariable String assessmentId) {
        List<TestGorillaCandidateDTO> candidates = testGorillaService.getInvitedCandidates(assessmentId);
        return ResponseEntity.ok(candidates);
    }

    @GetMapping("/pruebas/{assessmentId}/resultadosPruebas/{testTakerId}")
    public ResponseEntity<List<TestGorillaResultDTO>> getAssessmentResults(
            @PathVariable String assessmentId,
            @PathVariable ResultadosTestGorilla testTakerId) {
        List<TestGorillaResultDTO> results = testGorillaService.getAssessmentResults(assessmentId, testTakerId);
        return ResponseEntity.ok(results);
    }
}

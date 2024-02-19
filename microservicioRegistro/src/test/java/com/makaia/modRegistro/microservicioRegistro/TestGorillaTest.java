package com.makaia.modRegistro.microservicioRegistro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import com.makaia.modRegistro.microservicioRegistro.testGorilla.InvitationRequestDTO;
import com.makaia.modRegistro.microservicioRegistro.testGorilla.InvitationResponseDTO;
import com.makaia.modRegistro.microservicioRegistro.testGorilla.TestGorillaCandidateDTO;
import com.makaia.modRegistro.microservicioRegistro.testGorilla.TestGorillaService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TestGorillaTest {

    @Test
    public void testInviteCandidate() {
        // Arrange
        RestTemplate restTemplateMock = mock(RestTemplate.class);
        TestGorillaService testGorillaService = new TestGorillaService(restTemplateMock);

        InvitationRequestDTO invitationRequest = new InvitationRequestDTO("john@example.com", "John", "Doe");
        ResponseEntity<InvitationResponseDTO> mockResponseEntity = mock(ResponseEntity.class);

        // Configura el comportamiento esperado del restTemplateMock
        when(restTemplateMock.exchange(anyString(), eq(HttpMethod.POST), any(HttpEntity.class), eq(InvitationResponseDTO.class)))
                .thenReturn(mockResponseEntity);

        // Act
        InvitationResponseDTO response = testGorillaService.inviteCandidate("assessmentId", invitationRequest);

        // Assert
        // Verifica que el método exchange haya sido llamado con los argumentos correctos
        ArgumentCaptor<HttpEntity<InvitationRequestDTO>> requestEntityCaptor = ArgumentCaptor.forClass(HttpEntity.class);
        verify(restTemplateMock).exchange(anyString(), eq(HttpMethod.POST), requestEntityCaptor.capture(), eq(InvitationResponseDTO.class));

        // Verifica el contenido del HttpEntity enviado al método exchange
        HttpEntity<InvitationRequestDTO> capturedRequestEntity = requestEntityCaptor.getValue();
    }

//    @Test
//    public void testGetInvitedCandidates() {
//        // Configuración del mock del RestTemplate
//        RestTemplate restTemplateMock = mock(RestTemplate.class);
//        String testGorillaUrl = "http://testgorilla.com/api";
//        String testGorillaApiToken = "YOUR_FAKE_TOKEN";
//        TestGorillaService testGorillaService = new TestGorillaService(restTemplateMock);
//        testGorillaService.setTestGorillaUrl(testGorillaUrl);
//        testGorillaService.setTestGorillaApiToken(testGorillaApiToken);
//
//        // Datos de ejemplo
//        String assessmentId = "1";
//        TestGorillaCandidateDTO testCandidate1 = new TestGorillaCandidateDTO(1, LocalDateTime.now(), "david@gmail.com", "David U", 1, "123", true, "Hilarious", "Happy", 1234, "Completed", "Mild", "Done", 1, "Decks123");
//        TestGorillaCandidateDTO testCandidate2 = new TestGorillaCandidateDTO(2, LocalDateTime.now(), "daniel@gmail.com", "Daniel U", 2, "1233", false, "Hilariousss", "Sad", 12343, "Completed", "Milded", "Doned", 2, "Decks1233");
//        List<TestGorillaCandidateDTO> expectedCandidates = Arrays.asList(testCandidate1, testCandidate2);
//
//        // Mock del ResponseEntity con los candidatos esperados
//        ResponseEntity<TestGorillaCandidateDTO[]> responseEntityMock = mock(ResponseEntity.class);
//        when(responseEntityMock.getBody()).thenReturn(new TestGorillaCandidateDTO[]{testCandidate1, testCandidate2});
//        when(restTemplateMock.exchange(
//                ArgumentMatchers.eq(testGorillaUrl + "/assessments/candidature/?assessment=" + assessmentId),
//                ArgumentMatchers.eq(HttpMethod.GET),
//                ArgumentMatchers.any(HttpEntity.class),
//                ArgumentMatchers.<Class<TestGorillaCandidateDTO[]>>any()))
//                .thenReturn(responseEntityMock);
//
//        // Llamada al método a probar
//        List<TestGorillaCandidateDTO> actualCandidates = testGorillaService.getInvitedCandidates(assessmentId);
//
//        // Verificación de los resultados
//        assertEquals(expectedCandidates, actualCandidates);
//    }
}

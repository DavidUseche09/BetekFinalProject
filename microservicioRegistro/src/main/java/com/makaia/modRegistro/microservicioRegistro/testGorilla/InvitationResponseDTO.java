package com.makaia.modRegistro.microservicioRegistro.testGorilla;

public class InvitationResponseDTO {
    private Long id;
    private Long assessment;
    private String email;
    private String first_name;
    private String last_name;
    private String invitation_uuid;
    private String created;
    private Long testtaker_id;
    private String status;

    public InvitationResponseDTO() {
    }

    public InvitationResponseDTO(Long id, Long assessment, String email, String first_name, String last_name, String invitation_uuid, String created, Long testtaker_id, String status) {
        this.id = id;
        this.assessment = assessment;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.invitation_uuid = invitation_uuid;
        this.created = created;
        this.testtaker_id = testtaker_id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssessment() {
        return assessment;
    }

    public void setAssessment(Long assessment) {
        this.assessment = assessment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getInvitation_uuid() {
        return invitation_uuid;
    }

    public void setInvitation_uuid(String invitation_uuid) {
        this.invitation_uuid = invitation_uuid;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Long getTesttaker_id() {
        return testtaker_id;
    }

    public void setTesttaker_id(Long testtaker_id) {
        this.testtaker_id = testtaker_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

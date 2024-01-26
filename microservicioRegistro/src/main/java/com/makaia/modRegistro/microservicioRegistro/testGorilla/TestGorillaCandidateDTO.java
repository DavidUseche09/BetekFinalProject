package com.makaia.modRegistro.microservicioRegistro.testGorilla;

import java.time.LocalDateTime;

public class TestGorillaCandidateDTO {
    private int avg_score;
    private LocalDateTime created;
    private String email;
    private String full_name;
    private int id;
    private String invitation_uuid;
    private boolean is_hired;
    private String personality_algorithm;
    private String personality;
    private Integer rating;
    private String review;
    private String stage;
    private String status;
    private int testtaker_id;
    private String invitation_link;

    public TestGorillaCandidateDTO() {
    }

    public TestGorillaCandidateDTO(int avg_score, LocalDateTime created, String email, String full_name, int id, String invitation_uuid, boolean is_hired, String personality_algorithm, String personality, Integer rating, String review, String stage, String status, int testtaker_id, String invitation_link) {
        this.avg_score = avg_score;
        this.created = created;
        this.email = email;
        this.full_name = full_name;
        this.id = id;
        this.invitation_uuid = invitation_uuid;
        this.is_hired = is_hired;
        this.personality_algorithm = personality_algorithm;
        this.personality = personality;
        this.rating = rating;
        this.review = review;
        this.stage = stage;
        this.status = status;
        this.testtaker_id = testtaker_id;
        this.invitation_link = invitation_link;
    }

    public int getAvg_score() {
        return avg_score;
    }

    public void setAvg_score(int avg_score) {
        this.avg_score = avg_score;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvitation_uuid() {
        return invitation_uuid;
    }

    public void setInvitation_uuid(String invitation_uuid) {
        this.invitation_uuid = invitation_uuid;
    }

    public boolean isIs_hired() {
        return is_hired;
    }

    public void setIs_hired(boolean is_hired) {
        this.is_hired = is_hired;
    }

    public String getPersonality_algorithm() {
        return personality_algorithm;
    }

    public void setPersonality_algorithm(String personality_algorithm) {
        this.personality_algorithm = personality_algorithm;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTesttaker_id() {
        return testtaker_id;
    }

    public void setTesttaker_id(int testtaker_id) {
        this.testtaker_id = testtaker_id;
    }

    public String getInvitation_link() {
        return invitation_link;
    }

    public void setInvitation_link(String invitation_link) {
        this.invitation_link = invitation_link;
    }
}

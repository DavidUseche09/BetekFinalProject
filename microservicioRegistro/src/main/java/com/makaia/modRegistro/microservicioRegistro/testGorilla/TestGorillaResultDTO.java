package com.makaia.modRegistro.microservicioRegistro.testGorilla;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

public class TestGorillaResultDTO {

    private Long id;
    private String name;
    private Integer score;
    private String status;
    private Boolean completed;
    private Long testId;
    private List<String> customQuestions;
    private String algorithm;
    private Boolean isCodeTest;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX")
    private String scoreDisplay;

    public TestGorillaResultDTO() {
    }
    public TestGorillaResultDTO(Long id, String name, Integer score, String status, Boolean completed, Long testId, List<String> customQuestions, String algorithm, Boolean isCodeTest, String scoreDisplay) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.status = status;
        this.completed = completed;
        this.testId = testId;
        this.customQuestions = customQuestions;
        this.algorithm = algorithm;
        this.isCodeTest = isCodeTest;
        this.scoreDisplay = scoreDisplay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public List<String> getCustomQuestions() {
        return customQuestions;
    }

    public void setCustomQuestions(List<String> customQuestions) {
        this.customQuestions = customQuestions;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public Boolean getCodeTest() {
        return isCodeTest;
    }

    public void setCodeTest(Boolean codeTest) {
        isCodeTest = codeTest;
    }

    public String getScoreDisplay() {
        return scoreDisplay;
    }

    public void setScoreDisplay(String scoreDisplay) {
        this.scoreDisplay = scoreDisplay;
    }
}

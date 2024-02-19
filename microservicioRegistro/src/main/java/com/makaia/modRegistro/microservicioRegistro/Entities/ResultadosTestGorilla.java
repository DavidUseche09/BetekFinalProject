package com.makaia.modRegistro.microservicioRegistro.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class ResultadosTestGorilla {
    @Id
    @GeneratedValue()
    private Long test_id;
    @Column(length = 150)
    private String name;
    @Column(length = 150)
    private Long score;
    @Column(length = 100)
    private String status;
    @Column(length = 50)
    private Boolean completed;

    @Column(length = 200)
    private String custom_questions;
    @Column(length = 150)
    private String algorithm;
    @Column(length = 150)
    private Boolean is_code_test;
    @Column(length = 150)
    private String score_display;



    public ResultadosTestGorilla() {
    }

    public ResultadosTestGorilla(Long test_id, String name, Long score, String status, Boolean completed, String custom_questions, String algorithm, Boolean is_code_test, String score_display) {
        this.test_id = test_id;
        this.name = name;
        this.score = score;
        this.status = status;
        this.completed = completed;
        this.custom_questions = custom_questions;
        this.algorithm = algorithm;
        this.is_code_test = is_code_test;
        this.score_display = score_display;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
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

    public Long getTest_id() {
        return test_id;
    }

    public void setTest_id(Long test_id) {
        this.test_id = test_id;
    }

    public String getCustom_questions() {
        return custom_questions;
    }

    public void setCustom_questions(String custom_questions) {
        this.custom_questions = custom_questions;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public Boolean getIs_code_test() {
        return is_code_test;
    }

    public void setIs_code_test(Boolean is_code_test) {
        this.is_code_test = is_code_test;
    }

    public String getScore_display() {
        return score_display;
    }

    public void setScore_display(String score_display) {
        this.score_display = score_display;
    }
}
package com.makaia.modRegistro.microservicioRegistro.Dtos;



public class UsersDTO {
    private String email;
    private String password;
    private Long rol_id;

    public UsersDTO() {
    }

    public UsersDTO(String email, String password, Long rol_id) {
        this.email = email;
        this.password = password;
        this.rol_id = rol_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRol_id() {
        return rol_id;
    }

    public void setRol_id(Long rol_id) {
        this.rol_id = rol_id;
    }
}

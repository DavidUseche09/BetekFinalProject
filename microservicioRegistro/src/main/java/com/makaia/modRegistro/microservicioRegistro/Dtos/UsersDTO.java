package com.makaia.modRegistro.microservicioRegistro.Dtos;

<<<<<<< HEAD
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
=======

>>>>>>> a047ba527294553e9fc0a80daad2355f7846bf2d

public class UsersDTO {
    // Agregue estas anotaciones para mejorar el ingreso de datos
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotNull
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

package com.makaia.modRegistro.microservicioRegistro.Services;

import com.makaia.modRegistro.microservicioRegistro.Dtos.UsersDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Exceptions.RegistroApiException;
import com.makaia.modRegistro.microservicioRegistro.Repositories.RolesRepository;
import com.makaia.modRegistro.microservicioRegistro.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    UsuarioRepository repository;
    RolesRepository rolesRepository;
    PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UsuarioRepository repository, RolesRepository rolesRepository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.rolesRepository = rolesRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario crearUsuario(UsersDTO dto) {
        Optional<Usuario> exists = this.repository.findByEmail(dto.getEmail());
        if (exists != null) {
            throw new RegistroApiException("No se pudo crear el usuario, lo sentimos...");
        }
        Optional<Roles> rolOptional = rolesRepository.findById(dto.getRol_id());
        Roles rolesResult = new Roles(rolOptional.get().getId(), rolOptional.get().getDescripcion());
        Usuario nuevoUsuario = new Usuario(dto.getEmail(), passwordEncoder.encode(dto.getPassword()), rolesResult);
        nuevoUsuario = this.repository.save(nuevoUsuario);
        return nuevoUsuario;
    }

    public Usuario buscarUsuarioEmail(String email) {
        Optional<Usuario> usuarioOptional = repository.findByEmail(email);
        if (usuarioOptional.isPresent()) {
            return usuarioOptional.get();
        } else {
            throw new RegistroApiException("No se ha encontrado usuarios con ese correo, verifique" + email);
        }

    }
}

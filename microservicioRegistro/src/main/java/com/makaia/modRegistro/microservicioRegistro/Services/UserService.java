package com.makaia.modRegistro.microservicioRegistro.Services;

import com.makaia.modRegistro.microservicioRegistro.Dtos.UsersDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
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
    @Autowired
    public UserService(UsuarioRepository repository, RolesRepository rolesRepository) {
        this.repository = repository;
        this.rolesRepository = rolesRepository;
    }
    @Autowired
    PasswordEncoder passwordEncoder;
    public Usuario crearUsuario(UsersDTO dto){
        Usuario exists = this.repository.findByEmail(dto.getEmail());
        if (exists != null){
            throw new RuntimeException("Aca se cambia esta excepcion");
        }
      Optional<Roles> rolOptional = rolesRepository.findById(dto.getRol_id());
        Roles rolesResult = new Roles(rolOptional.get().getId(),rolOptional.get().getDescripcion());
        Usuario nuevoUsuario = new Usuario(dto.getEmail(), passwordEncoder.encode(dto.getPassword()),rolesResult);
        nuevoUsuario= this.repository.save(nuevoUsuario);
        return nuevoUsuario;
    }
}

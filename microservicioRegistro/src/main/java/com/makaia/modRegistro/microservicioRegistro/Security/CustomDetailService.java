package com.makaia.modRegistro.microservicioRegistro.Security;

import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Repositories.RolesRepository;
import com.makaia.modRegistro.microservicioRegistro.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomDetailService {
@Autowired
    UsuarioRepository usuarioRepository;
    RolesRepository rolesRepository;

@Override
    public UserDetails loadUserByUsername (String email) throws UsernameNotFoundException{
    Usuario user = this.usuarioRepository.findByEmail(email);
    if(user== null){
        throw new UsernameNotFoundException("Correo no encontrado, verifique"+email);
    }
    UserDetails userCreate = User.withUsername(user.getEmail())
            .password(user.getPassword())
            .roles(user.getRol().getDescripcion())
            .build();
    return userCreate;
}
public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder(8);
}
}

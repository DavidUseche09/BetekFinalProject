package com.makaia.modRegistro.microservicioRegistro.Security;

import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomDetailService implements UserDetailsService {
@Autowired
    UsuarioRepository usuarioRepository;

@Override
public UserDetails loadUserByUsername (String email) throws UsernameNotFoundException{
    Optional<Usuario> user = this.usuarioRepository.findByEmail(email);
    Usuario userResult = new Usuario(user.get().getEmail(),user.get().getPassword(),user.get().getRol());
    if(user== null){
        throw new UsernameNotFoundException(email);
    }
    List<Roles> rol = new ArrayList<>();
     rol.add(new Roles(userResult.getRol().getDescripcion()));
    UserDetails userCreate = User.withUsername(userResult.getEmail())
            .password(userResult.getPassword())
            .roles(userResult.getRol().getDescripcion())
            .build();
    System.out.println(userCreate);
    return userCreate;

}
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(8);
    }
}

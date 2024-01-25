package com.makaia.modRegistro.microservicioRegistro.Security;

import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Repositories.RolesRepository;
import com.makaia.modRegistro.microservicioRegistro.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomDetailService implements UserDetailsService {
@Autowired
    UsuarioRepository usuarioRepository;

@Override
public UserDetails loadUserByUsername (String email) throws UsernameNotFoundException{
    Usuario user = this.usuarioRepository.findByEmail(email);
    if(user== null){
        throw new UsernameNotFoundException(email);
    }
    List<Roles> rol = new ArrayList<>();
     rol.add(new Roles(user.getRol().getDescripcion()));
    UserDetails userCreate = User.withUsername(user.getEmail())
            .password(user.getPassword())
            .roles("ROLE_"+user.getRol().getDescripcion())
            .build();
    System.out.println(userCreate);
    return userCreate;

    // Manera simplificada de codigo
//    String[] roles = { "ROLE_" + user.getRol().getDescripcion() };
//    return User.withUsername(user.getEmail())
//            .password(user.getPassword())
//            .roles(roles)
//            .build();

}
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(8);
    }
}

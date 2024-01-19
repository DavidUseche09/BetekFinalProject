package com.makaia.modRegistro.microservicioRegistro;
import com.makaia.modRegistro.microservicioRegistro.Dtos.UsersDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Repositories.RolesRepository;
import com.makaia.modRegistro.microservicioRegistro.Repositories.UsuarioRepository;
import com.makaia.modRegistro.microservicioRegistro.Services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @Mock
    private RolesRepository rolesRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    // Inyecta dependencias en el servicio
    @InjectMocks
    private UserService userService;

    // Inicializa mocks
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCrearUsuario() {
        // Arrange
        UsersDTO usersDTO = new UsersDTO("test@example.com", "password", 1L);

        when(usuarioRepository.findByEmail("test@example.com")).thenReturn(null);
        when(rolesRepository.findById(1L)).thenReturn(Optional.of(new Roles(1L, "Programador")));
//        when(passwordEncoder.encode("password")).thenReturn("hashedPassword");
        when(usuarioRepository.save(any())).thenReturn(new Usuario("test@example.com", passwordEncoder.encode("password"), new Roles("Programador")));


        // Act
        Usuario nuevoUsuario = userService.crearUsuario(usersDTO);

        // Assert
        assertNotNull(nuevoUsuario);
        verify(usuarioRepository, times(1)).findByEmail("test@example.com");
        verify(rolesRepository, times(1)).findById(1L);
        verify(usuarioRepository, times(1)).save(any());
        verify(passwordEncoder, times(1)).encode("password");
    }

}

package com.makaia.modRegistro.microservicioRegistro;

import com.makaia.modRegistro.microservicioRegistro.Dtos.UsersDTO;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Repositories.RolesRepository;
import com.makaia.modRegistro.microservicioRegistro.Repositories.UsuarioRepository;
import com.makaia.modRegistro.microservicioRegistro.Services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @Mock
    private RolesRepository rolesRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    @Test
    public void crearUsuarioCorrectamente() {
        // Arrange
        UsersDTO dto = new UsersDTO("test@example.com", "password", 1L);

        Roles mockedRole = new Roles(1L, "Programador");
        Mockito.when(rolesRepository.findById(dto.getRol_id())).thenReturn(Optional.of(mockedRole));
        Mockito.when(usuarioRepository.findByEmail(dto.getEmail())).thenReturn(null);
        Mockito.when(passwordEncoder.encode(Mockito.any(CharSequence.class))).thenReturn("hashedPassword");
        Mockito.when(usuarioRepository.save(Mockito.any(Usuario.class))).thenAnswer(invocation -> {
            Usuario userToSave = invocation.getArgument(0);
            return new Usuario(userToSave.getEmail(), userToSave.getPassword(), userToSave.getRol());
        });

        // Act
        Usuario result = userService.crearUsuario(dto);

        // Assert
        assertEquals(dto.getEmail(), result.getEmail());
    }

    @Test
    public void crearUsuario_UsuarioYaExiste_LanzarExcepcion() {
        // Arrange
        UsersDTO dto = new UsersDTO("existing@example.com", "password", 1L);

        Mockito.when(usuarioRepository.findByEmail(dto.getEmail())).thenReturn(null);

        // Act y Assert
        assertThrows(RuntimeException.class, () -> userService.crearUsuario(dto));
    }
}



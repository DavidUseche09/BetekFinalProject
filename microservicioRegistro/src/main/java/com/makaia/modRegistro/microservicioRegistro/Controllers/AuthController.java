package com.makaia.modRegistro.microservicioRegistro.Controllers;

import com.makaia.modRegistro.microservicioRegistro.Dtos.ErrorResponseDto;
import com.makaia.modRegistro.microservicioRegistro.Dtos.LoginRequestDto;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Security.JwtUtil;
import com.makaia.modRegistro.microservicioRegistro.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/auth")
public class AuthController {
    private  final AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;
    private UserService userService;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.userService = userService;
    }


    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody LoginRequestDto loginReq){
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginReq.getEmail(), loginReq.getPassword()));
          String username = authentication.getName();
          Usuario usuario = userService.buscarUsuarioEmail(username);
          String token = jwtUtil.crearToken(usuario);
          LoginRequestDto loginRes = new LoginRequestDto(username,token);
          return  ResponseEntity.ok(loginRes);
        }catch (BadCredentialsException e) {
            ErrorResponseDto errorResponse = new ErrorResponseDto(HttpStatus.BAD_REQUEST, "Usuario o contraseña invalido");
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(HttpStatus.BAD_REQUEST, e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponseDto);
        }
    }
    }

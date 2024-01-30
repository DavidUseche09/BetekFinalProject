package com.makaia.modRegistro.microservicioRegistro.Controllers;

import com.makaia.modRegistro.microservicioRegistro.Dtos.LoginRequestDto;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import com.makaia.modRegistro.microservicioRegistro.Security.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/auth")
public class AuthController {
    private  final AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseBody login(@ResponseBody LoginRequestDto loginReq){
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginReq.getEmail(),loginReq.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);

        }
    }
}

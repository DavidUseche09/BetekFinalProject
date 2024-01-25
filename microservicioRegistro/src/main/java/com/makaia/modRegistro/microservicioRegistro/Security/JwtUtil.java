package com.makaia.modRegistro.microservicioRegistro.Security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private final String secret_key = "mysecretkey";
    private long accessTokenValidity = 60*60*1000;

   // private final JwtParser jwtParser;

    private final String TOKEN_HEADER = "Authorization";
    private final String TOKEN_PREFIX = "Bearer ";
}

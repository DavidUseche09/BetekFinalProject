package com.makaia.modRegistro.microservicioRegistro.Security;

import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import com.makaia.modRegistro.microservicioRegistro.Entities.Usuario;
import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import javax.naming.AuthenticationException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {
    private final String secret_key = "mysecretkey";
    private long accessTokenValidity = 60*60*1000;
    private final JwtParser jwtParser;

    private final String TOKEN_HEADER = "Authorization";
    private final String TOKEN_PREFIX = "Bearer ";

    public JwtUtil() {
        this.jwtParser = (JwtParser) Jwts.parser().setSigningKey(secret_key);
    }
    public  String crearToken(Usuario usuario, List<Roles> roles){
        List<String> rolesName = roles.stream().map(Roles::getDescripcion).toList();
        Claims claims = (Claims) Jwts.claims().setSubject(usuario.getEmail());
        Date tokenCreateTime = new Date();
        Date tokenValidity = new Date(tokenCreateTime.getTime()+ TimeUnit.MINUTES.toMillis(accessTokenValidity));
        return Jwts.builder()
                .setClaims(claims)
                .claim("roles", rolesName)
                .setExpiration(tokenValidity)
                .signWith(SignatureAlgorithm.HS256, secret_key)
                .compact();
    }
    private Claims parseJwtClaims(String token){
        return jwtParser.parseClaimsJws(token).getBody();
    }
    public Claims resolveClaims(HttpServletRequest req){
        try{
            String token = resolveToken(req);
            if (token != null){
                return parseJwtClaims(token);
            }
            return null;
        }catch (ExpiredJwtException ex){
            req.setAttribute("expired", ex.getMessage());
            throw ex;
        }catch (Exception ex){
            req.setAttribute("invalid",ex.getMessage());
            throw ex;
        }
    }
    public String resolveToken(HttpServletRequest request){
        String bearerToken = request.getHeader(TOKEN_HEADER);
        if (bearerToken != null && bearerToken.startsWith(TOKEN_PREFIX)){
            return bearerToken.substring(TOKEN_PREFIX.length());
        }
        return null;
    }
    public boolean validateClaims (Claims claims) throws AuthenticationException{
        try {
            return claims.getExpiration().after(new Date());
        }catch (Exception e){
            throw e;
        }
    }
    public  String getEmail (Claims claims){
        return claims.getSubject();
    }
    public static  List<String> getRoles (Claims claims){
        return (List<String>) claims.get("roles");
    }

}

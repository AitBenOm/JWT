package com.jwt.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import model.JwtUser;
import org.springframework.stereotype.Component;

@Component
public class JwtGeneratorToken {
    public String generateToken(JwtUser jwtUser) {
        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
                claims.put("userId", String.valueOf(jwtUser.getId()));
                claims.put("Role", jwtUser.getRole());

              return  Jwts.builder()
                .setClaims(claims).signWith(SignatureAlgorithm.HS512,"youtube")
                .compact();
    }
}

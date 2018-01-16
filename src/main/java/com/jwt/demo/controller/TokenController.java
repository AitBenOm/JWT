package com.jwt.demo.controller;

import com.jwt.demo.security.JwtGeneratorToken;
import model.JwtUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGeneratorToken jwtGeneratorToken;
    public TokenController (JwtGeneratorToken jwtGeneratorToken){
        this.jwtGeneratorToken= jwtGeneratorToken;
    }
    @PostMapping
    public String getToken(@RequestBody final JwtUser jwtUser){
return jwtGeneratorToken.generateToken(jwtUser) ;
    }
}

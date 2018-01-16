package com.jwt.demo.controller;

import com.jwt.demo.security.JwtGeneratorToken;
import model.JwtUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    @PostMapping
    public String getToken(@RequestBody final JwtUser jwtUser){
    JwtGeneratorToken jwtGeneratorToken = new JwtGeneratorToken();
   return  jwtGeneratorToken.generateToken(jwtUser);
    }
}

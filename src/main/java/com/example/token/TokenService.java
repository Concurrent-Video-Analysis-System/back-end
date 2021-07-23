/**
 * 
 */
package com.example.token;

import com.auth0.jwt.algorithms.Algorithm;
import com.example.entity.User;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;

/**
 * @author 
 *
 */
@Service
public class TokenService {

	public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getUser_id())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}

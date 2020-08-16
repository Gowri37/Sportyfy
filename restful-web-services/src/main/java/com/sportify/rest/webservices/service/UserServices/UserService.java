package com.sportify.rest.webservices.service.UserServices;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.sportify.rest.webservices.model.User;



@Service
public interface UserService {
	User findByMobile(String mobile) throws Exception;
	User getUserDetailById(long userId) throws Exception;
	User signUpUser(HashMap<String,String> signupRequest) throws Exception;
	
}
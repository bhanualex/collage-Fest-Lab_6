package com.gl.CollegeFestRegestration.service;

import com.gl.CollegeFestRegestration.dto.UserRegistrationDto;
import com.gl.CollegeFestRegestration.entity.User;

public interface UserService {
	public User save(UserRegistrationDto registrationDto);


}

package fun.kolowert.labmodules.m2.service;

import fun.kolowert.labmodules.m2.dto.UserDto;

public interface UserService {
	UserDto getUser(String email);
	UserDto createUser(UserDto userDto);
	UserDto updateUser(String email, UserDto userDto);
	void deleteUser(String email);
}

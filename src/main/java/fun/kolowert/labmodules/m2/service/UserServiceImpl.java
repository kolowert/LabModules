package fun.kolowert.labmodules.m2.service;

import org.springframework.stereotype.Service;

import fun.kolowert.labmodules.m2.dto.UserDto;
import fun.kolowert.labmodules.m2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository; 
	
	@Override
	public UserDto getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(String email, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deketeUser(String email) {
		// TODO Auto-generated method stub
		
	}

}

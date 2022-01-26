package fun.kolowert.labmodules.m2.service;

import org.springframework.stereotype.Service;

import fun.kolowert.labmodules.m2.dto.UserDto;
import fun.kolowert.labmodules.m2.model.User;
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
		log.info("get user by email {}", email);
		User user = userRepository.getUser(email);
		return mapUserToUserDto(user);
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		log.info("create user");
		User user = mapUserDtoToUser(userDto);
		user = userRepository.createUser(user);
		return mapUserToUserDto(user);
	}

	@Override
	public UserDto updateUser(String email, UserDto userDto) {
		log.info("update user with email {}", email);
		User user = mapUserDtoToUser(userDto);
		user = userRepository.updateUser(email, user);
		return mapUserToUserDto(user);
	}

	@Override
	public void deleteUser(String email) {
		log.info("delete user with email {}", email);
		userRepository.deleteUser(email);
	}

	private UserDto mapUserToUserDto(User user) {
		return UserDto.builder().firstName(user.getFirstName()).lastName(user.getLastName()).email(user.getEmail())
				.build();
	}

	private User mapUserDtoToUser(UserDto userDto) {
		return User.builder().firstName(userDto.getFirstName()).lastName(userDto.getLastName())
				.email(userDto.getEmail()).password(userDto.getPassword()).build();
	}

}

package fun.kolowert.labmodules.m2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fun.kolowert.labmodules.m2.dto.UserDto;
import fun.kolowert.labmodules.m2.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/{email}")
	public UserDto getUser(@PathVariable String email) {
		return userService.getUser(email);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public UserDto createUser(@RequestBody UserDto userDto) {
		return userService.createUser(userDto);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PutMapping(value = "/{email}")
	public UserDto updateUser(@PathVariable String email, @RequestBody UserDto userDto) {
		return userService.updateUser(email, userDto);
	}
	
	@RequestMapping(value = "/{email}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUser(@PathVariable String email){
		userService.deleteUser(email);
		return ResponseEntity.noContent().build();
	}
	
}

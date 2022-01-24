package fun.kolowert.labmodules.m2.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import fun.kolowert.labmodules.m2.model.User;

@Component
public class UserRepositoryImpl implements UserRepository {
	
	private final List<User> list = new ArrayList<>();
	
	public UserRepositoryImpl() {
		fillList();
	}
	
	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return list.stream()
				.filter(user -> user.getEmail().equals(email))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("User is not found!"));
	}

	@Override
	public User createUser(User user) {
		list.add(user);
		return user;
	}

	@Override
	public User updateUser(String email, User user) {
		boolean isDeleted = list.removeIf(u -> u.getEmail().equals(email));
		if (isDeleted) {
			list.add(user);
		} else {
			throw new RuntimeException("User is not found!");
		}
		return user;
	}

	@Override
	public void deleteUser(String email) {
		list.removeIf(u -> u.getEmail().equals(email));
	}
	
	private void fillList() {
		
	}
	
}

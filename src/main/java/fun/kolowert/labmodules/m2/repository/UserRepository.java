package fun.kolowert.labmodules.m2.repository;

import fun.kolowert.labmodules.m2.model.User;

public interface UserRepository {
	User getUser(String email);
	User createUser(User user);
	User updateUser(String email, User user);
	void deleteUser(String email);
}

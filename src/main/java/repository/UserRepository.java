package repository;

import models.User;

import java.util.HashMap;
import java.util.Optional;

public class UserRepository {

    private static UserRepository userRepository;

    private final HashMap<String, User> userHashMap;

    private UserRepository() {
        this.userHashMap = new HashMap<>();
    }

    public static UserRepository getInstance() {
        if (userRepository == null) {
            return new UserRepository();
        }
        return userRepository;
    }

    public void save(User user) {
        userHashMap.put(user.getUserId(), user);
    }

    public Optional<User> findUserById(String userId) {
        return Optional.ofNullable(userHashMap.get(userId));
    }

    public void delete(String userId) {
        userHashMap.remove(userId);
    }
}

package service.impl;

import models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.UserRepository;
import service.UserService;

public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private static UserService userService;

    private final UserRepository userRepository;

    private UserServiceImpl() {
        this.userRepository = UserRepository.getInstance();
    }

    public static UserService getInstance() {
        if (userService == null) {
            return new UserServiceImpl();
        }
        return userService;
    }

    @Override
    public void addUser(User user) {
        logger.info("Add a new user: {}", user);
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user, String userId) {

    }

    @Override
    public User getUser(String userId) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }
}

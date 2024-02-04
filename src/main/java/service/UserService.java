package service;

import models.User;

public interface UserService {

    void addUser(User user);
    void updateUser(User user, String userId);
    User getUser(String userId);
    void deleteUser(String userId);
}

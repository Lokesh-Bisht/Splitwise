package service;

import models.User;

import java.util.List;

public interface GroupService {

    void createGroup(List<User> users, String imageUri, String title, String description);
    void updateGroupInfo(Long groupId);
    void fetchGroup(Long groupId);
    void deleteGroup(Long groupId);
}

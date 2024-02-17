package service;

import models.User;

import java.util.List;

public interface GroupService {

    void createGroup(List<User> users, String imageUri, String title, String description);
    void updateGroupInfo(String groupId, String imageUri, String title, String description);
    void fetchGroup(String groupId);
    void deleteGroup(String groupId);
}

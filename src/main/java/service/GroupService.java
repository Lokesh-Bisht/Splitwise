package service;

import models.Group;
import models.User;

import java.util.List;

public interface GroupService {

    void createGroup(List<User> users, String imageUri, String title, String description);
    void updateGroupInfo(String groupId, String imageUri, String title, String description);
    Group fetchGroup(String groupId);
    void deleteGroup(String groupId);
    Group addOrRemoveUsers(List<User> users, String groupId);
}

package service;

import models.Group;

public interface GroupService {

    void createGroup(Group group);
    void updateGroup(Long groupId);
    void fetchGroup(Long groupId);
    void deleteGroup(Long groupId);
}

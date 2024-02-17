package service.impl;

import models.Group;
import models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.GroupRepository;
import service.GroupService;

import java.util.List;
import java.util.UUID;

public class GroupServiceImpl implements GroupService {

    private Long groupIdCounter;

    private static  final Logger logger = LoggerFactory.getLogger(GroupServiceImpl.class);

    private static GroupService groupService;

    private final GroupRepository groupRepository;

    private GroupServiceImpl() {
        this.groupRepository = GroupRepository.getInstance();
    }

    public static GroupService getInstance() {
        if (groupService == null) {
            return new GroupServiceImpl();
        }
        return groupService;
    }

    @Override
    public void createGroup(List<User> users, String imageUri, String title, String description) {
        Group group = new Group(UUID.randomUUID().toString(), users, imageUri, title, description);
        groupRepository.save(group);
    }

    @Override
    public void updateGroupInfo(Long groupId) {

    }

    @Override
    public void fetchGroup(Long groupId) {

    }

    @Override
    public void deleteGroup(Long groupId) {

    }
}

package service.impl;

import exception.GroupNotFoundException;
import models.Group;
import models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.GroupRepository;
import service.GroupService;

import java.util.List;
import java.util.Optional;
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
    public void updateGroupInfo(String groupId, String imageUri, String title, String description) {
        logger.info("Update group info for group {}", groupId);
        if (groupRepository.findById(groupId).isEmpty()) {
            logger.error("An error occurred while updating the group info.");
            throw new GroupNotFoundException("Group with groupId " + groupId + "doesn't exist");
        }
        Group group = groupRepository.findById(groupId).get();
        group.setImageURI(imageUri);
        group.setTitle(title);
        group.setDescription(description);
        groupRepository.save(group);
    }

    @Override
    public Group fetchGroup(String groupId) {
        Optional<Group> group = groupRepository.findById(groupId);
        if (group.isEmpty()) {
            throw new GroupNotFoundException("Group not found!");
        }
        return group.get();
    }

    @Override
    public void deleteGroup(String groupId) {

    }
}

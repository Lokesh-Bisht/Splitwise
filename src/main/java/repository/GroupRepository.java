package repository;

import models.Group;

import java.util.HashMap;

public class GroupRepository {

    private static GroupRepository groupRepository;

    private final HashMap<String, Group> groupHashMap;

    private GroupRepository() {
        this.groupHashMap = new HashMap<>();
    }

    public static GroupRepository getInstance() {
        if (groupRepository == null) {
            return new GroupRepository();
        }
        return groupRepository;
    }

    public void save(Group group) {
        groupHashMap.put(group.getId(), group);
    }

}

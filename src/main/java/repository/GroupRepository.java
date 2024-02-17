package repository;

import models.Group;

import java.util.HashMap;
import java.util.Optional;

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

    public Optional<Group> findById(String groupId) {
        return Optional.ofNullable(groupHashMap.get(groupId));
    }

    public void delete(Group group) {
        groupHashMap.remove(group.getId());
    }
}

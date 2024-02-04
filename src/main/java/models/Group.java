package models;

import java.util.List;

public class Group {

    private Long id;

    private List<User> users;

    private String imageURI;

    private String title;

    private String description;

    public Group(List<User> users, String imageURI, String title, String description) {
        this.users = users;
        this.imageURI = imageURI;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURI(String imageURI) {
        this.imageURI = imageURI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Group{" +
            "id = " + id +
            ", users = " + users +
            ", imageURI = '" + imageURI + '\'' +
            ", title = '" + title + '\'' +
            ", description = '" + description + '\'' +
            '}';
    }
}

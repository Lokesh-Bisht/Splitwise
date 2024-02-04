package models;

import java.util.UUID;

public class User {

    private UUID userId;

    private String firstname;

    private String lastname;

    public User(String firstname, String lastname) {
        this.userId = UUID.randomUUID();
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getUserId() {
        return userId.toString();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", firstname = '" + firstname + '\'' +
            ", lastname = '" + lastname + '\'' +
            '}';
    }
}

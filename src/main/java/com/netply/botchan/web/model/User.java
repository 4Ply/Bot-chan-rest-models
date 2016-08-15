package com.netply.botchan.web.model;

public class User {
    private String clientID;
    private String platform;


    public User() {
    }

    public User(String clientID, String platform) {
        this.clientID = clientID;
        this.platform = platform;
    }

    public String getClientID() {
        return clientID;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (clientID != null ? !clientID.equals(user.clientID) : user.clientID != null) return false;
        return platform != null ? platform.equals(user.platform) : user.platform == null;
    }

    @Override
    public int hashCode() {
        int result = clientID != null ? clientID.hashCode() : 0;
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "clientID='" + clientID + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}

package com.netply.botchan.web.model;

public class TrackPlayerRequest {
    private User user;
    private String playerName;


    public TrackPlayerRequest() {

    }

    public TrackPlayerRequest(User user, String playerName) {
        this.user = user;
        this.playerName = playerName;
    }

    public User getUser() {
        return user;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrackPlayerRequest that = (TrackPlayerRequest) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        return playerName != null ? playerName.equals(that.playerName) : that.playerName == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (playerName != null ? playerName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TrackPlayerRequest{" +
                "user=" + user +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}

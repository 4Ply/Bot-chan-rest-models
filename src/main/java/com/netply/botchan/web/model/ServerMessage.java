package com.netply.botchan.web.model;

public class ServerMessage {
    private int userID;
    private String message;


    public ServerMessage() {

    }

    public ServerMessage(int userID, String message) {
        this.userID = userID;
        this.message = message;
    }

    public int getUserID() {
        return userID;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ServerMessage{" +
                "userID=" + userID +
                ", message='" + message + '\'' +
                '}';
    }
}

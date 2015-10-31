package com.jedify.model;

/**
 * Created by j1013575 on 10/31/2015.
 */
public class Message {
    private String message;
    private String cause;
    private String description;

    public Message(String message, String cause, String description) {
        this.message = message;
        this.cause = cause;
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.example.siwesapplication;

import java.util.Date;

public class Message {
    private String supervisorId;
 
    private String messageId;
    private String senderId;
    private String receiverId;
    private String content;
    private Date timestamp;

    // Constructor
    public Message(String messageId,String supervisorId, String senderId, String receiverId, String content, Date timestamp) {
        this.messageId = messageId;
        this.supervisorId = supervisorId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Message(String supervisorId, String content) {
    }

    // Methods
    public String getMessageDetails() {
        return "Message ID: " + messageId + "\n" +
                "Sender ID: " + senderId + "\n" +
                "Receiver ID: " + receiverId + "\n" +
                "Content: " + content + "\n" +
                "Timestamp: " + timestamp;
    }

    // Getters and setters
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

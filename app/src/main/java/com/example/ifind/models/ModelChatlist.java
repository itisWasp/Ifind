package com.example.ifind.models;

public class ModelChatlist {
    String id; //we will needs this id to get chat list, sender/receiver uid

    public ModelChatlist(String id) {
        this.id = id;
    }

    public ModelChatlist() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

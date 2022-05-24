package com.example.websocket.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Message {
    private MessageType type;
    private String content,sender;

    public enum MessageType{
        CHAT,JOIN,LEAVE;
    }

}

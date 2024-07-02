package com.deva.ourchat.chat;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {

    public enum MessageType { CHAT,JOIN,LEAVE}

    private String content;
    private String sender;
    private MessageType type;
}

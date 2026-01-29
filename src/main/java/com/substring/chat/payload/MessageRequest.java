package com.substring.chat.payload;

import org.springframework.messaging.handler.annotation.SendTo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SendTo
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {

    private String sender;
    private String content;
    private String roomId;

    

}

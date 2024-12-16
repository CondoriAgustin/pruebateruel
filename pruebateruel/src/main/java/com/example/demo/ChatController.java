package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatController {

    private List<String> mensajes = new ArrayList<>();

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public List<String> handleMessage(String message) {
        if (message.toLowerCase().contains("websocket")) {
            mensajes.add("WebSocket es un protocolo que proporciona comunicación full-duplex a través de una sola conexión TCP. Puerto predeterminado: 80 para HTTP, 443 para HTTPS.");
        } else {
            mensajes.add(message);
        }
        return mensajes;
    }
}
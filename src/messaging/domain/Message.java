package messaging.domain;


import java.time.Instant;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class Message {
    private UUID id;
    private UUID conversationId;
    private UUID senderId;
    private UUID receiverId;
    private String content;
    private Instant sentAt;
}

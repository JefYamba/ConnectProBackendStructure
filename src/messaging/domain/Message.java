package messaging.domain;


import messaging.domain.vo.ConversationId;
import messaging.domain.vo.MessageId;
import messaging.domain.vo.ReceiverId;
import messaging.domain.vo.SenderId;
import user.domain.vo.UserId;

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
    private MessageId id;
    private ConversationId conversationId;
    private SenderId senderId;
    private ReceiverId receiverId;
    private String content;
    private Instant sentAt;
}

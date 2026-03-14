package messaging.applicaion.dtos;


import messaging.domain.vo.ConversationId;
import messaging.domain.vo.ReceiverId;
import messaging.domain.vo.SenderId;

import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record MessageRequest (
        UUID conversationId,
        UUID senderId,
        UUID receiverId,
        String content
){}


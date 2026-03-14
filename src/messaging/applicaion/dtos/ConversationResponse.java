package messaging.applicaion.dtos;


import messaging.domain.vo.ConversationId;
import user.applicaion.dtos.UserResponse;
import user.domain.vo.UserId;

import java.time.Instant;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record ConversationResponse (
        UUID id,
        UserResponse participantA,
        UserResponse participantB,
        Instant createdAt,
        Instant lastModifiedAt
){}

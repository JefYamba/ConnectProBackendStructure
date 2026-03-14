package engagement.applicaion.dtos;

import java.time.Instant;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record ReviewResponse(
        UUID id,
        UUID reviewerId,
        UUID serviceId,
        int rating,
        String comment,
        Instant createdAt
) {}


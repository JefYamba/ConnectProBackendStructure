package engagement.domain;


import engagement.domain.vo.Rating;
import portfolio.domain.vo.ServiceId;
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
public class Review { // Non updatable
    private UUID id;
    private UserId reviewerId;
    private ServiceId serviceId;
    private Rating rating;
    private String comment;
    private Instant createdAt;
}

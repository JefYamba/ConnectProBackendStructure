package engagement.domain;


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
public class Like {
    private UUID id;
    private UserId userId;
    private ServiceId serviceId;
    private Instant createdAt;
}

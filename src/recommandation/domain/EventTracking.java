package recommandation.domain;

import java.time.Instant;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class EventTracking {
    private UUID id;
    private UUID userId;
    private EventType eventType;
    private UUID targetId;
    private TargetType targetType;
    private Instant timestamp;

    public enum EventType {
        LIKE,
        REVIEW,
        CLICK,
        VIEW,
    }
    public enum TargetType {
        LIKE,
        REVIEW,
        PORTFOLIO,
        SERVICE,
        CONTACT_FOR_SERVICE,
        JOB_POST,
        JOB_APPLICATION,
    }
}

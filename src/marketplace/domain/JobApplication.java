package marketplace.domain;


import java.util.Date;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class JobApplication {
    private UUID id;
    private UUID applicantId;
    private UUID jobPostId;
    private String motivation;
    private Date appliedAt;
    private ApplicationStatus status;

    public enum ApplicationStatus {
        PENDING,
        ACCEPTED,
        REJECTED
    }
}

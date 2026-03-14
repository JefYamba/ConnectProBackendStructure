package portfolio.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class JobPost {

    private UUID id;
    private UUID portfolioId;
    private String title;
    private String description;
    private Category category;
    private List<String> tags; // Optional
    private Budget budget; // Optional
    private JobType jobType;
    private WorkMode workMode;
    private List<String> requiredSpokenLanguages; // Optional
    private Date deadline;

    public enum WorkMode {
        REMOTE,
        ON_SITE,
        HYBRID
    }
    
    public enum JobType {
        FULL_TIME,
        PART_TIME,
        FREELANCE,
        INTERNSHIP,
    }

    // -------------------- Budget --------------------
    public static class Budget {
        private BigDecimal amountFrom;
        private BigDecimal amountTo;
        private boolean isNegociable;
        private PayPeriod payPeriod;
        
        public enum PayPeriod {
            HOURLY,
            DAILY,
            WEEKLY,
            MONTHLY
        }
    }
}


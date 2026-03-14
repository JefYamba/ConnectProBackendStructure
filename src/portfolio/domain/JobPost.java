package portfolio.domain;

import portfolio.domain.vo.*;
import shared.domain.vo.JobType;
import shared.domain.vo.PayPeriod;
import shared.domain.vo.WorkMode;

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

    private JobPostId id;
    private PortfolioId portfolioId;
    private String title;
    private String description;
    private CategoryId categoryId;
    private Tags tags; // Optional
    private Budget budget; // Optional
    private JobType jobType;
    private WorkMode workMode;
    private Languages requiredSpokenLanguages; // Optional
    private Date deadline;
    
}


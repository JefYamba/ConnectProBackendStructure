package marketplace.applicaion.dtos;


import portfolio.applicaion.dtos.CategoryResponse;
import shared.application.dtos.BudgetData;
import shared.application.dtos.PortfolioSummaryResponse;
import shared.domain.vo.JobType;
import shared.domain.vo.WorkMode;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public class JobPostListingResponse {
    private UUID id;
    private PortfolioSummaryResponse portfolio;
    private String title;
    private CategoryResponse category;
    private List<String> tags; // Optional
    private BudgetData budget; // Optional
    private JobType jobType;
    private WorkMode workMode;
    private Date deadline;
}

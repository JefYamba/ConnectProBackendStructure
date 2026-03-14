package portfolio.applicaion.dtos;


import portfolio.domain.Category;
import shared.application.dtos.BudgetData;
import shared.application.dtos.PortfolioSummaryResponse;
import shared.domain.vo.JobType;
import shared.domain.vo.WorkMode;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID; /**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record JobPostRequest (
        UUID portfolioId,
        String title,
        String description,
        UUID categoryId,
        List<String> tags,
        BudgetData budget,
        JobType jobType,
        WorkMode workMode,
        List<String> requiredSpokenLanguages,
        LocalDate deadline
) {}

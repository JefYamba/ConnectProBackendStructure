package marketplace.applicaion.dtos;


import marketplace.domain.JobApplication;
import portfolio.domain.vo.JobPostId;
import shared.application.dtos.PortfolioSummaryResponse;
import shared.domain.vo.JobApplicationStatus;
import user.domain.vo.UserId;

import java.util.Date;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record JobApplicationResponse (
        UUID id,
        PortfolioSummaryResponse applicant,
        PortfolioSummaryResponse employer,
        UUID jobPostId,
        String motivation,
        Date appliedAt,
        JobApplicationStatus status
) {}


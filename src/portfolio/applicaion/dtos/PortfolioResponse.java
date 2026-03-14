package portfolio.applicaion.dtos;


import marketplace.applicaion.dtos.JobPostListingResponse;
import marketplace.applicaion.dtos.ServiceListingResponse;
import portfolio.domain.vo.PortfolioType;
import portfolio.domain.vo.SocialLink;

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
public record PortfolioResponse (
    UUID id,
    UUID userId,
    PortfolioType type,
    Date createdAt,
    GeneralInfoResponse generalInfo,
    ProfessionalInfoResponse professionalInfo,
    ContactInfoData contactInfo,
    LocationInfoData locationInfo,
    List<SocialLink> socialLinks,
    List<ServiceListingResponse> services,
    List<JobPostListingResponse> jobPosts
) {}

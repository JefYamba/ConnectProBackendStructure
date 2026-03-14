package portfolio.applicaion.dtos;


import engagement.applicaion.dtos.ReviewResponse;
import shared.application.dtos.PortfolioSummaryResponse;
import shared.application.dtos.PricingData;

import java.util.List;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public record ServiceResponse(
    UUID id, 
    PortfolioSummaryResponse portfolio, 
    String title, 
    String description,
    UUID categoryId, 
    List<String> tags, 
    String coverImageUrl,
    List<String> imageUrls, 
    PricingData pricing, 
    List<FAQResponse> faqs,
    AwardResponse award, 
    double averageRating, 
    int numberOfReviews,
    List<ReviewResponse> recentReviews
) {}


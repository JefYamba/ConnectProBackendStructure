package portfolio.applicaion.dtos;


import engagement.applicaion.dtos.ReviewResponse;
import shared.application.dtos.PricingData;

import java.nio.file.Files;
import java.util.List;
import java.util.UUID; /**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public record ServiceRequest(
    UUID portfolioId,
    String title, 
    String description,
    CategoryRequest category, 
    List<String> tags, 
    Files coverImageUrl,
    List<Files> imageUrls, 
    PricingData pricing, 
    List<FAQRequest> faqs,
    int numberOfReviews
) {}

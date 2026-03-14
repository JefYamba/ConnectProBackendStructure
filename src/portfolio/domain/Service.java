package portfolio.domain;

import portfolio.domain.vo.*;
import shared.domain.vo.ImagesUrls;

import java.util.List;
import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class Service {
    private ServiceId id;
    private PortfolioId portfolioId;
    private String title;
    private String description;
    private CategoryId categoryId;
    private String coverImageUrl;
    
    private Tags tags; // Optional
    private ImagesUrls imageUrls; // Optional
    private Pricing pricing; // Optional
    private List<FAQ> faqs; // Optional
    private Award award; // Optional
}


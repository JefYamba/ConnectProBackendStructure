package marketplace.applicaion.dtos;


import portfolio.domain.Badge;
import portfolio.domain.Category;
import shared.application.dtos.PortfolioSummaryResponse;

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
public class ServiceListingResponse {

    private UUID id;
    private PortfolioSummaryResponse portfolio;
    private String title;
    private String description;
    private Category category;
    private List<String> tags;
    private String coverImageUrl;

    private Pricing pricing;
    private Badge badges;
    
    private double averageRating;
    private int numberOfReviews;
    
    // -------------------- Pricing --------------------
    public static class Pricing {
        private double basePrice;
        private int deliveryTimeDays;
        private int revisions;
        private List<Extra> extras;

        public static class Extra {
            private String name;
            private double price;
            private String description;
        }
    }
}

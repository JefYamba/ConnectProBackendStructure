package portfolio.domain;

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
public class Service {
    private UUID id;
    private String portfolioId;

    private String title;
    private String description;
    private Category category;
    private List<String> tags;
    private String coverImageUrl;
    private List<String> imageUrls;

    private Pricing pricing;
    private List<FAQ> faqs;
    private Badge badges;
    
    // -------------------- Pricing --------------------
    public static class Pricing {
        private double basePrice;
        private int deliveryDays;
        private boolean isNegotiable;
        private List<Extra> extras;

        public static class Extra { // max = 3
            private ExtraType type;
            private String name;
            private double price;
            private String description;
            
            public enum  ExtraType {
                Bronze, Silver, Gold
            }
        }
    }
    
    // -------------------- FAQ --------------------
    public static class FAQ {
        private String question;
        private String answer;
    }
}


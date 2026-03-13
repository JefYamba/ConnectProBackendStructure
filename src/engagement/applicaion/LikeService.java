package engagement.applicaion;


import portfolio.PortfolioClient;

import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class LikeService {

    private final PortfolioClient portfolioClient;
    public LikeService( PortfolioClient portfolioClient) {
        this.portfolioClient = portfolioClient;
    }

    void like(UUID userId, UUID serviceId) {
        if (!this.portfolioClient.existsAndValidById(serviceId)) {
            throw new RuntimeException();
            
        };
    }
}

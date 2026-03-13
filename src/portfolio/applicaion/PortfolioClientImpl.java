package portfolio.applicaion;


import portfolio.PortfolioClient;

import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class PortfolioClientImpl implements PortfolioClient {
    @Override
    public boolean existsAndValidById(UUID serviceId) {
        return true;
    }
}

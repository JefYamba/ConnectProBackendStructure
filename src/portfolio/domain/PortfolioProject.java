package portfolio.domain;


import portfolio.domain.vo.PortfolioId;
import shared.domain.vo.ImagesUrls;

import java.time.LocalDate;
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
public class PortfolioProject {
    private UUID id;
    private PortfolioId portfolioId;
    private String title;
    private String description;
    private ImagesUrls imageUrls;
    private LocalDate startAt;
    private LocalDate completedAt;
}
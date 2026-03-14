package portfolio.domain.vo;


import portfolio.domain.Badge;
import portfolio.domain.PortfolioProject;

import java.util.List;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public  class GeneralInfo {
    private String name;
    private String shortDescription;
    private String longDescription; // Optional
    private String profilePhotoUrl;
    private String coverImageUrl;
    private Languages spokenLanguages; // Optional
    private PortfolioStatus status;
}


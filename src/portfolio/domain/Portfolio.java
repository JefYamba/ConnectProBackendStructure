package portfolio.domain;

import portfolio.domain.vo.*;
import user.domain.vo.UserId;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class Portfolio {

    private PortfolioId id;
    private UserId userId;
    private PortfolioType type;
    private LocalDate createdAt;

    private GeneralInfo generalInfo;
    private ProfessionalInfo professionalInfo;
    private ContactInfo contactInfo;
    private LocationInfo locationInfo;
    private List<SocialLink> socialLinks; // Optional
}


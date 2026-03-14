package portfolio.applicaion.dtos;


import java.time.LocalDate;
import java.util.List;
import java.util.UUID; /**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record PortfolioProjectRequest(
        UUID portfolioId,
        String title,
        String description,
        List<String> imageUrls,
        LocalDate startAt,
        LocalDate completedAt
) {}

package portfolio.applicaion.dtos;


import portfolio.domain.vo.PortfolioStatus;

import java.nio.file.Files;
import java.util.List; /**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record GeneralInfoRequest(
        String name,
        String shortDescription,
        String longDescription,
        Files profilePhotoUrl,
        Files coverImageUrl,
        List<String> spokenLanguages,
        PortfolioStatus status
) {}

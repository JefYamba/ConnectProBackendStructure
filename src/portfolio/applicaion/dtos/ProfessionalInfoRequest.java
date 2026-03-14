package portfolio.applicaion.dtos;


import portfolio.domain.Badge;
import portfolio.domain.vo.Availability;

import java.util.List; /**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record ProfessionalInfoRequest(
    int activeYears,
    int numberOfEmployees,
    List<Availability> availabilities
) {}

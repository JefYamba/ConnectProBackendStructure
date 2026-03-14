package shared.application.dtos;


import shared.domain.vo.ExtraType;

import java.util.List; /**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record PricingData(
                double basePrice,
                int deliveryDays,
                boolean isNegotiable,
                List<ExtraResponse> extras // Optional
) {
    public record ExtraResponse(
            ExtraType type,
            String name,
            double price,
            String description
    ){}
}

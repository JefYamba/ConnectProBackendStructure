package portfolio.domain.vo;


import shared.domain.vo.PayPeriod;

import java.math.BigDecimal;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
// -------------------- Budget --------------------
public class Budget {
    private BigDecimal amountFrom;
    private BigDecimal amountTo;
    private boolean isNegociable;
    private PayPeriod payPeriod;
}

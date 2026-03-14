package portfolio.domain;


import portfolio.domain.vo.HexColor;

import java.awt.*;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class Badge {
    private Long id;
    private String name;       
    private HexColor color;       // hex color
    private String description;  // Optional
}

/*
    Verified
    Top Rated
    Pro Seller
    Trusted
    New Seller
 */
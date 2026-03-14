package engagement.domain.vo;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/14/26
 */
public record Rating(int rating) {
    public Rating {
        if (rating < 0 || rating > 5) 
            throw new IllegalArgumentException("Invalid rating. Rating value must be between 0 and 5");
    }
}

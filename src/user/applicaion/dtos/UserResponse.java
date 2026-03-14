package user.applicaion.dtos;


import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */

public record UserResponse (
        UUID id,
        String email,
        String username,
        String name,
        String imageUrl
) {}


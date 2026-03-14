package user.domain;


import user.domain.vo.Email;
import user.domain.vo.UserId;

import java.util.UUID;

/**
 * @author Jôph Exauce Fouschard Yamba
 * @version 1.0
 * @email joph.e.f.yamba@gmail.com
 * @github <a href="https://github.com/JefYamba">https://github.com/JefYamba</a>
 * @date 3/13/26
 */
public class User {
    private UserId id;
    private Email email;
    private String passwordHash;
}

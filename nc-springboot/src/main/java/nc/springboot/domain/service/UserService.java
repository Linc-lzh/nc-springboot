package nc.springboot.domain.service;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class UserService {
    public String test(){
        return "linc testing = " + new Random().nextInt(100);
    }
}

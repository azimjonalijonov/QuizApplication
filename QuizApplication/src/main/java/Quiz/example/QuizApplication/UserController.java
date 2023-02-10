package Quiz.example.QuizApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/get")
    public List<UserEntity > get(){
        List<UserEntity> res =  userService.getInfo();
        return  res;
    }
    @PostMapping("/post")
    public void addUser(@Validated @RequestBody UserEntity userEntity){
        userService.save(userEntity);
    }
}

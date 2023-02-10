package Quiz.example.QuizApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {
    @Autowired
    UserInterface userInterface;
    public List<UserEntity> getInfo(){
        return userInterface.findAll();
    }
    public  void save(UserEntity userEntity){
        userInterface.save(userEntity);

    }
}

package Quiz.example.QuizApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<UserEntity,Long> {
}

package pl.com.redbeardsoftware.shoplj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.com.redbeardsoftware.shoplj.models.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query
    Optional<User> findUserByEmail(String email);

}
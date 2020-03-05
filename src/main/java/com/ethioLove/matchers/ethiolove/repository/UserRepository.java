package com.ethioLove.matchers.ethiolove.repository;
import com.ethioLove.matchers.ethiolove.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.lName = :lastname AND u.email = :email")
    User findByEmailAndlName(@Param("email") String email,
                                   @Param("lastname") String lastname
                             );
    @Query("select u from User u where u.password = :password AND u.email = :email")
    User findByEmailAndPassword(@Param("email") String email,
                                @Param("password") String password);
}
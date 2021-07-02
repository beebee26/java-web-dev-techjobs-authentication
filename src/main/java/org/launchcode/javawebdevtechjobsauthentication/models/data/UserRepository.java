package org.launchcode.javawebdevtechjobsauthentication.models.data;
import org.launchcode.javawebdevtechjobsauthentication.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}


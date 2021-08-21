package com.example.paulinabackend.signup;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 Step 5: Create this class, this is the class that allows you to query your database.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findUserByEmailAndPassword(String email, String password);
}

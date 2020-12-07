package com.softserveinc.ita.homeproject.homedata.repository;

import com.softserveinc.ita.homeproject.homedata.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * UserRepository is the interface that is needed
 * for interaction with Users in the database.
 *
 * @author Mykyta Morar
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    /**
     * Method for finding users in database by email
     *
     * @param email email of the user that is being searched
     * @return an instance of Optional(User) class
     */
    Optional<User> findByEmail(String email);

}
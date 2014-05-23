package com.springapp.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 908869 on 5/23/2014.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

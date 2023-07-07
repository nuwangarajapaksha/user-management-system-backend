package com.example.springboot01.repo;

import com.example.springboot01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
    User getUserByUserID(String userId);

    @Query(value = "SELECT * FROM user WHERE id = ?1 AND address = ?2", nativeQuery = true)
    User getUserByUserIDAndAddress(String userId, String address);
}

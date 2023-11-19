package com.gl.CollegeFestRegestration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.CollegeFestRegestration.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

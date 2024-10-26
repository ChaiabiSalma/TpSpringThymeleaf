package com.example.TpSpring.CrudRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.TpSpring.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}

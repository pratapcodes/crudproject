package com.CRUDproject.CRUDp.repository;

import com.CRUDproject.CRUDp.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}

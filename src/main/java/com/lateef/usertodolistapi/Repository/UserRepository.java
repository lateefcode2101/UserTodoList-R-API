/**
 * 
 */
package com.lateef.usertodolistapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lateef.usertodolistapi.Model.User;

/**
 * @author UNIQ
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

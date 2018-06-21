package com.shekhargulati.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.shekhargulati.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	/*@Query("Select U from User U where userId=:ID")
	public
*/
}

package com.shekhargulati.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.shekhargulati.app.entity.Dependency;


@Repository
public interface DependencyRepository extends JpaRepository<Dependency, String> {
	
	

}

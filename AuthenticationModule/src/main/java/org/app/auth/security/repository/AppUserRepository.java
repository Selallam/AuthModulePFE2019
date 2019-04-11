package org.app.auth.security.repository;

import org.app.auth.model.security.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
	AppUser findByUsername(String username);
 void syso();
	
	
}

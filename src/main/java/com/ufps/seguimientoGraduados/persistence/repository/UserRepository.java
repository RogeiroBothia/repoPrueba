package com.ufps.seguimientoGraduados.persistence.repository;

import com.ufps.seguimientoGraduados.persistence.entity.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserApp,Long> {
    Optional<UserApp> findUserByUsername(String username);
    List<UserApp> findByIsNoUserTrue();
}

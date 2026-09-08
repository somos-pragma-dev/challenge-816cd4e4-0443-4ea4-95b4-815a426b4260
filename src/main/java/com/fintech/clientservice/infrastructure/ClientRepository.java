package com.fintech.clientservice.infrastructure;

import com.fintech.clientservice.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findById(Long id);
    boolean existsByEmail(String email);
}
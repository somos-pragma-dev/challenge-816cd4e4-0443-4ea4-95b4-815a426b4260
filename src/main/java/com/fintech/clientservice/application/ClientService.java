package com.fintech.clientservice.application;

import com.fintech.clientservice.domain.Client;
import com.fintech.clientservice.infrastructure.ClientRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public Client createClient(@Valid @NotNull Client client) {
        if (clientRepository.existsByEmail(client.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        return clientRepository.save(client);
    }

    @Transactional
    public Client updateClient(@Valid @NotNull Client client) {
        if (!clientRepository.existsById(client.getId())) {
            throw new RuntimeException("Client not found");
        }
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(@NotNull Long id) {
        return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
    }

    @Transactional
    public void deleteClient(@NotNull Long id) {
        if (!clientRepository.existsById(id)) {
            throw new RuntimeException("Client not found");
        }
        clientRepository.deleteById(id);
    }
}
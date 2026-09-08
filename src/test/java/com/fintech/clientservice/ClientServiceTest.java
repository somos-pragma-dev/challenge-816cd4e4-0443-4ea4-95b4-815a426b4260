package com.fintech.clientservice;

import com.fintech.clientservice.application.ClientService;
import com.fintech.clientservice.domain.Client;
import com.fintech.clientservice.infrastructure.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClientServiceTest {
    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateClient() {
        Client client = new Client("John Doe", "john.doe@example.com", LocalDate.of(1990, 1, 1));
        when(clientRepository.save(client)).thenReturn(client);
        Client createdClient = clientService.createClient(client);
        assertNotNull(createdClient);
        assertEquals(client.getName(), createdClient.getName());
    }

    @Test
    void testUpdateClient() {
        Client client = new Client(1L, "John Doe", "john.doe@example.com", LocalDate.of(1990, 1, 1));
        when(clientRepository.existsById(1L)).thenReturn(true);
        when(clientRepository.save(client)).thenReturn(client);
        Client updatedClient = clientService.updateClient(client);
        assertNotNull(updatedClient);
        assertEquals(client.getName(), updatedClient.getName());
    }

    @Test
    void testGetAllClients() {
        // Implement test for getAllClients
    }

    @Test
    void testGetClientById() {
        // Implement test for getClientById
    }

    @Test
    void testDeleteClient() {
        // Implement test for deleteClient
    }
}
package com.example.restapi.rest.crudDemo;

import com.example.restapi.rest.crudDemo.DTO.CustomerDTO;
import com.example.restapi.rest.crudDemo.DTO.UserDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient(timeout = "10000000")
class AccountIdentifierResourceTest {

    @Autowired
    private WebTestClient webTestClient;

    @BeforeEach
    void setup() {
    }

    @Test
    void find_shouldSucceed() {
        webTestClient.get()
                     .uri("/get/{id}", "9884")
                     //.header(AUTHORIZATION, GANONDORF.getAuthorization())
                     .exchange()
                     .expectStatus().isOk()
                     .expectBody(UserDTO.class)
                     .consumeWith(t -> {
                         UserDTO api = t.getResponseBody();
                     });
    }

    @Test
    void add_shouldSucceed() {
        webTestClient.post()
                     .uri("/addData" )
                     //.header(AUTHORIZATION, GANONDORF.getAuthorization())
                     //.bodyValue(new UserDTO())
                     .exchange()
                     .expectStatus().isOk()
                     .expectBody(UserDTO.class)
                     .consumeWith(t -> {
                         UserDTO api = t.getResponseBody();
                     });
    }

    @Test
    void addCustomer_shouldSucceed() {
        webTestClient.post()
                     .uri("/addCustomer" )
                     //.header(AUTHORIZATION, GANONDORF.getAuthorization())
                     .bodyValue(new CustomerDTO("ICICI", "ICIC1000", "John", "12345", 50000.00))
                     .exchange()
                     .expectStatus().isOk()
                     .expectBody(CustomerDTO.class)
                     .consumeWith(t -> {
                         CustomerDTO api = t.getResponseBody();
                     });
    }

    @Test
    void findCustomer_shouldSucceed() {
        webTestClient.get()
                     .uri("/getCustomer/{id}", "12345_ID")
                     //.header(AUTHORIZATION, GANONDORF.getAuthorization())
                     .exchange()
                     .expectStatus().isOk()
                     .expectBody(CustomerDTO.class)
                     .consumeWith(t -> {
                         CustomerDTO api = t.getResponseBody();
                     });
    }
}
package com.lifeway.lifewaytest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@SpringBootTest
class LifewaytestApplicationTests {


    @Test
    public void testcall() {
        TestRestTemplate testRestTemplate = new TestRestTemplate();
        ResponseEntity<String> response = testRestTemplate.
                getForEntity("http://localhost:8080/message?id=8ssdfgd3ak&message=askd0jj", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }
}
package com.coding.challenge.news.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.doThrow;

@SpringBootTest
class NotiziaServiceTests {

    @Autowired
    NotiziaService notiziaService;
    @Test
    void testFindByIdNotizia() {
        notiziaService.getNotizia(2);
    }
}

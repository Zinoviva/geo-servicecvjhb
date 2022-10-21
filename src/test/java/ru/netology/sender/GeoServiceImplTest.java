package ru.netology.sender;

import org.junit.jupiter.api.*;

public class GeoServiceImplTest {
    @BeforeEach
    void setUp() {
        System.out.println("Вызываюсь до выполнения теста");
    }
    final String MOSCOW_IP = "172.0.32.11";

    @Test
    void byIpTest(){
        Assertions.assertEquals("172.0.32.11",MOSCOW_IP);
    }
}

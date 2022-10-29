package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
class MessageSenderImplTest {

    private static final String IP_ADDRESS_HEADER = "x-real-ip";
    @Spy
    private GeoService geoService;
    @Mock
    private LocalizationService localizationService;
    private MessageSenderImpl messageSender;

//    @BeforeEach
//    void setUp() {
//        localizationService = Mockito.mock(LocalizationService.class);
//        messageSender = new MessageSenderImpl(geoService, localizationService);
//
////        Mockito.when(localizationService.get(Mockito.any()))
////                .thenReturn(Set.of(GeoService.values()));
//    }

    @Test
    void sendRussia() {
        String ipAdress = "172.01.100.11";
        String locate = "Welcome";
        Location moscow = new Location("Moscow", Country.RUSSIA, "1", 2);

        Mockito.when(geoService.byIp(ipAdress)).thenReturn(moscow);
        Mockito.when(localizationService.locale(Country.RUSSIA)).thenReturn(locate);
        MessageSenderImpl ms = new MessageSenderImpl(geoService, localizationService);
        String result = ms.send(Map.of(IP_ADDRESS_HEADER, ipAdress));

        Assertions.assertEquals("Welcome", result);
    }

    @Test
    void sendEnglish() {
        String ipAdress = "96.13.122.10";
        String locate = "Hello";
        Location usa = new Location("USA", Country.USA, "5", 2);

        Mockito.when(geoService.byIp(ipAdress)).thenReturn(usa);
        Mockito.when(localizationService.locale(Country.USA)).thenReturn(locate);
        MessageSenderImpl ms = new MessageSenderImpl(geoService, localizationService);
        String result = ms.send(Map.of(IP_ADDRESS_HEADER, ipAdress));

        Assertions.assertEquals("Hello", result);
    }

    @Test
    void sendSpain() {
        String ipAdress = "127.30.202.88";
        String locate = "HI";
        Location brazil = new Location("Brazil", Country.BRAZIL, "4", 2);

        Mockito.when(geoService.byIp(ipAdress)).thenReturn(brazil);
        Mockito.when(localizationService.locale(Country.BRAZIL)).thenReturn(locate);
        MessageSenderImpl ms = new MessageSenderImpl(geoService, localizationService);
        String result = ms.send(Map.of(IP_ADDRESS_HEADER, ipAdress));

        Assertions.assertEquals("HI", result);
    }
}

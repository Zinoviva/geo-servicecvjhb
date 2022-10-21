package ru.netology.sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.entity.Country;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;

@ExtendWith(MockitoExtension.class)
class MessageSenderImplTest {

    private static final String IP_ADDRESS_HEADER = "x-real-ip";
    @Spy
    private GeoService geoService;
    @Mock
    private LocalizationService localizationService;
    private MessageSenderImpl messageSender;

    @BeforeEach
    void setUp() {
        localizationService =Mockito.mock(LocalizationService.class);
        messageSender = new MessageSenderImpl(geoService, localizationService);

//        Mockito.when(localizationService.get(Mockito.any()))
//                .thenReturn(Set.of(GeoService.values()));
    }

//    @BeforeEach
//    void setUp() {
//        geoService = new GeoServiceImplMock();  //создаем мокк
//        localizationService = new LocalizationServiceImplMock(); //создаем мокк
//        messageSender = new MessageSenderImpl(geoService, localizationService);
//    }
//
    @Test
    void sendRussia() {
        geoService.byIp(GeoServiceImpl.MOSCOW_IP);  //задем мокку поведение
        localizationService.locale(Country.RUSSIA); //задем мокку поведение
       //String h = messageSender.send(IP_ADDRESS_HEADER);
//        Mockito.when(geoService.byIp("172.0.32.11").thenReturn(RUSSIA));
//Mockito.when(localizationService.locale(RUSSIA).thenReturn(Set.of("Добро пожаловать")));
//Map <String,String > actualResult = messageSender.send(IP_ADDRESS_HEADER);

    }
//    @Test
//    void sendEnglish() {
//        geoService.byIp(GeoServiceImpl.LOCALHOST);  //задем мокку поведение
//        localizationService.locale(Country.USA); //задем мокку поведение
//    }

}

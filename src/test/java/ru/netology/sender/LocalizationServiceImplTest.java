package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.verification.VerificationMode;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;
import ru.netology.i18n.LocalizationServiceImplMock;

import java.util.Set;

import static ru.netology.entity.Country.RUSSIA;

@ExtendWith(MockitoExtension.class)
class LocalizationServiceImplTest {
    private LocalizationServiceImplMock localizationServiceImplMock;
    private Country country;

    @Captor
    private ArgumentCaptor captorRussia;

    @Captor
    private ArgumentCaptor captorUSA;

    private LocalizationServiceImpl localizationService;

    @BeforeEach
    void setLocalizationService() {
        localizationService = new LocalizationServiceImpl();
    }

//    @Test
//    void someBusinessLogic_whenObjectIsRussia() {
//        Object valueRussia = RUSSIA;
//        localizationService.locale((Country) valueRussia);
//        Mockito.verify(RUSSIA);  //передают аргумент (), проверяет вызывается ли метод.
//        String actualValue = (String) captorRussia.getValue();
//        Assertions.assertEquals(valueRussia, actualValue);
//    }


}

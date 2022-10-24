package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.i18n.LocalizationServiceImpl;
import static ru.netology.entity.Country.RUSSIA;
import static ru.netology.entity.Country.USA;

@ExtendWith(MockitoExtension.class)
class LocalizationServiceImplTest {
//    private LocalizationServiceImplMock localizationServiceImplMock;
    private LocalizationServiceImpl localizationService;

    @BeforeEach
    void setLocalizationService() {
        localizationService = new LocalizationServiceImpl();
    }

    @Test
    void someBusinessLogic_whenObjectIsRussia() {
        String locate = localizationService.locale(RUSSIA);
        Assertions.assertEquals("Добро пожаловать", locate);
    }

    @Test
    void someBusinessLogic_whenObjectIsUSA() {
        String locate = localizationService.locale(USA);
        Assertions.assertEquals("Welcome", locate);
    }
}

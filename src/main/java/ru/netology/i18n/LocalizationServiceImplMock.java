package ru.netology.i18n;

import ru.netology.entity.Country;

public class LocalizationServiceImplMock extends LocalizationServiceImpl {
    public String locale;

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public String locale(Country country) {
        return super.locale(country);
    }

}

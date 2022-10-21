package ru.netology.geo;

import ru.netology.entity.Location;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class GeoServiceImplMock extends GeoServiceImpl {
    private String LOCALHOST;
    private String MOSCOW_IP;
    private String NEW_YORK_IP;

    public void setLOCALHOST(String LOCALHOST) {
        this.LOCALHOST = LOCALHOST;
    }

    public void setMOSCOW_IP(String MOSCOW_IP) {
        this.MOSCOW_IP = MOSCOW_IP;
    }

    public void setNEW_YORK_IP(String NEW_YORK_IP) {
        this.NEW_YORK_IP = NEW_YORK_IP;
    }

    @Override
    public Location byIp(String ip) {
        return super.byIp(ip);
    }

    @Override
    public Location byCoordinates(double latitude, double longitude) {
        return super.byCoordinates(latitude, longitude);
    }
}

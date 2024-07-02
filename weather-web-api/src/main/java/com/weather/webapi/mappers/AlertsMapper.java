package com.weather.webapi.mappers;

import com.weather.weatherdata.model.Alerts;
import com.weather.webapi.contract.AlertsDto;
import org.springframework.stereotype.Component;

@Component
public class AlertsMapper implements IMap<AlertsDto , Alerts>{
    @Override
    public Alerts map(AlertsDto item) {
        Alerts alerts = new Alerts();
        alerts.setDescription(item.getDescription());
        alerts.setTitle(item.getTitle());
        return alerts;
    }
}

@Component
class AlertsToDtoMapper implements IMap<Alerts , AlertsDto>{
    @Override
    public AlertsDto map(Alerts item) {
        AlertsDto alertsDto = new AlertsDto();
        alertsDto.setDescription(item.getDescription());
        alertsDto.setTitle(item.getTitle());
        return alertsDto;
    }
}

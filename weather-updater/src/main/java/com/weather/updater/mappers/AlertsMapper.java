package com.weather.updater.mappers;

import com.weather.client.contract.AlertsDto;
import com.weather.weatherdata.model.Alerts;
import org.springframework.stereotype.Component;


@Component
public class AlertsMapper implements IMapEntities<AlertsDto, Alerts>{

    @Override
    public Alerts toEntity(AlertsDto dto) {
        return map(dto, new Alerts());
    }

    @Override
    public Alerts map(AlertsDto dto, Alerts alerts) {
        alerts.setDescription(dto.getDescription());
        alerts.setTitle(dto.getTitle());
        alerts.setSeverity(dto.getSeverity());
        alerts.setEffectiveUtc(dto.getEffectiveUtc());
        alerts.setEffectiveLocal(dto.getEffectiveLocal());
        alerts.setExpiresUtc(dto.getExpiresUtc());
        alerts.setExpiresLocal(dto.getExpiresLocal());
        alerts.setUri(dto.getUri());
        alerts.setCityName(dto.getCityName());
        return alerts;
    }
}

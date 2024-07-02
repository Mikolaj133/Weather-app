package com.weather.webapi.contract;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ForcastSummaryDto {
    private List<ForcastDto> data;
}

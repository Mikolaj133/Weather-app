package com.weather.webapi.mappers;

public interface IMap<TValue, TResult> {
    TResult map(TValue item);
}


package com.weather.updater.mappers;

public interface IMapEntities <Tdto , TEntity>{

    TEntity toEntity(Tdto dto);
    TEntity map(Tdto dto , TEntity entity);

}

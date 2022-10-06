package com.learning.datasources.config.db;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DataSourceType  {

    TEST("test"), LIVE("live");
    private final String name;

}

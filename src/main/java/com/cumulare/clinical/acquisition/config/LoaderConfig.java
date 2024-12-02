package com.cumulare.clinical.acquisition.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class LoaderConfig {

    @Value("${loader.name}")
    private String loaderName;


}

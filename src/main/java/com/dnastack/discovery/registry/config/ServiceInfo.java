package com.dnastack.discovery.registry.config;

import com.dnastack.discovery.registry.domain.Maturity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "app.service-info")
public class ServiceInfo {

    private String id;
    private String name;
    private String type;
    private String organization;
    private String version;
    private String description;
    private String documentationUrl;
    private String contactUrl;
    private Maturity maturity;
    private Object extension;

}

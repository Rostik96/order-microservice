package com.rost.microservice.order.domain;

import com.rost.microservice.order.enums.HealthStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Health {
    private HealthStatus status;
}

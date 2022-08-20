package com.manish.configclient;

import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component("inventoryMode")
@ConfigurationProperties(prefix = "inventory.initial")
@NoArgsConstructor
@RefreshScope
public class InventoryMode {


    private String mode;

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

}
package com.manish.configclient;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@NoArgsConstructor
public class StatusController {

    @Autowired
    InventoryMode inventoryMode;

    @GetMapping("/mode")
    public String getMethod() throws RuntimeException {
        return inventoryMode.getMode();

    }
}

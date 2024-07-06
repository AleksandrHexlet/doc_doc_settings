package com.docdoc.settings.controller;

import com.docdoc.settings.model.Filter;
import com.docdoc.settings.model.Order;
import com.docdoc.settings.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/settings")
public class SettingsController {

    SettingsService service;

    @Autowired
    public SettingsController(SettingsService service) {
        this.service = service;
    }

    @GetMapping("/filter")
    public Map<Filter.FilterType, List<Filter>> getFilters() {
        return service.getFilters();
    }

    @GetMapping("/order")
    public List<Order> getOrder() {
        return service.getOrder();
    }
}

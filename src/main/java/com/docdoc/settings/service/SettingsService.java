package com.docdoc.settings.service;
import com.docdoc.settings.model.Filter;
import com.docdoc.settings.model.Order;
import com.docdoc.settings.repository.OrderRepository;
import com.docdoc.settings.repository.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SettingsService {

    private final SettingsRepository settingsRepository;
    private final OrderRepository orderRepository;
    @Autowired
    public SettingsService(SettingsRepository settingsRepository, OrderRepository orderRepository) {
        this.settingsRepository = settingsRepository;
        this.orderRepository = orderRepository;
    }

    public Map<Filter.FilterType,List<Filter>> getFilters() {
     return settingsRepository.findAllByIsActiveTrue()
              .stream().collect(Collectors.groupingBy(filter -> filter.getType()));
    }

    public List<Order> getOrder() {
        return orderRepository.findAllByIsActiveTrue();
    }
}

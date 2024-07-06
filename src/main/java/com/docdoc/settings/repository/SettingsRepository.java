package com.docdoc.settings.repository;

import com.docdoc.settings.model.Filter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SettingsRepository  extends JpaRepository<Filter,Long> {

    List<Filter> findAllByIsActiveTrue();
}

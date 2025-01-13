package com.tagify.TagifySystem.repository;

import com.tagify.TagifySystem.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.*;; // Импортируйте вашу модель

public interface UserRepository extends JpaRepository<model, Long> {
    // Здесь можно добавить дополнительные методы поиска, если нужно
}

package com.jongwon.lee.digitalkey.repository;

import com.jongwon.lee.digitalkey.entity.Key;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyRepository extends JpaRepository<Key, Long> {
}

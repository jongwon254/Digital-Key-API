package com.jongwon.lee.digitalkey.controller;

import com.jongwon.lee.digitalkey.entity.Key;
import com.jongwon.lee.digitalkey.repository.KeyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/key")
public class KeyController {

    private KeyRepository keyRepository;

    public KeyController(KeyRepository keyRepository) {
        this.keyRepository = keyRepository;
    }

    @GetMapping("")
    public List<Key> index() {
        return keyRepository.findAll();
    }
}

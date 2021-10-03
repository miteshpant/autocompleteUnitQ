package com.unitq.cachingservice.controller;

import com.unitq.cachingservice.service.CachingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/autocomplete")
@Slf4j
public class CachingController {

    @Autowired
    private CachingService cachingService;

    @GetMapping("/{word}")
    public List<String> getWords(@PathVariable("word") String word){

        log.info("Finding text matching the string {}", word);
        return cachingService.getWords(word);
    }
}

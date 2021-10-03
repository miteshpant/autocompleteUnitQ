package com.unitq.cachingservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CachingService {

    public List<String> getWords(String word) {

//        TODO : Implement a hash based cache service
//         and use a doubly linked list to keep track
//         of order  of search made and use LRU to refresh cache

        log.info("Serving from cache");
        List results = null;
        results.add("Served from cache");
        log.info(results.toString());
        return results;
    }
}

package com.unitq.autocomplete.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class AutocompleteService {

    //    This service will interact with the text file
    //    and implement logic to get the matching words

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private Utility trieUtility;

    public List<String> getWords(String word) {

        //TODO: Implement caching service using
        // LRU to reduce searching frequently used words.
        // If there is a cache miss then proceed else serve from cache.
        // List cachedResponse =  restTemplate.getForObject("lb://CACHING-SERVICE:/autocomplete/" + word, ArrayList.class);

        return trieUtility.findMatch(word);

    }



}

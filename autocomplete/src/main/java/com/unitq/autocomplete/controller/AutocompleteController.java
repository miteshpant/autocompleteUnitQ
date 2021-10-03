package com.unitq.autocomplete.controller;

import com.unitq.autocomplete.service.AutocompleteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/autocomplete")
@Slf4j
public class AutocompleteController {

    //This is the API controller defining the
    // API paths available in the application

    @Autowired
    private AutocompleteService autocompleteService;

    @GetMapping("/{word}")
    public List<String> getWords(@PathVariable("word") String word){

        log.info("Finding text matching the string %s", word);

        if(word.length() < 3){
            //  If the length is too short , we do not need
            //  to match the words to reduce load
            return new ArrayList<>();
        }
        return autocompleteService.getWords(word);

    }


}

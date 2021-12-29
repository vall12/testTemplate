package com.platformv.dictionaries.controllers;

import com.platformv.dictionaries.controllers.contracts.DictionariesContract;
import com.platformv.dictionaries.services.UfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import ru.sbrf.ufs.provider.api.dto.dictionary.CountQueryRequest;
import ru.sbrf.ufs.provider.api.dto.dictionary.QueryRequest;
import ru.sbrf.ufs.provider.api.dto.dictionary.Row;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dictionary")
public class DictionariesController implements DictionariesContract {

    private static final String DICTIONARY_PREFIX = "dictionary/";

    private UfsService dictionaryService;

    @Autowired
    public DictionariesController(UfsService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @PostMapping("/{dictName}/rows")
    public Row[] getRows(@PathVariable String dictName, @RequestBody QueryRequest query) {
        return dictionaryService.post(DICTIONARY_PREFIX + dictName + "/rows", query, Row[].class);
    }

    @PostMapping("/{dictName}/row")
    public Row getRow(@PathVariable String dictName, @RequestBody QueryRequest query) {
        return dictionaryService.post(DICTIONARY_PREFIX + dictName + "/row", query, Row.class);
    }

    @PostMapping("/{dictName}/count")
    public Long getCount(@PathVariable String dictName, @RequestBody CountQueryRequest query) {
        return dictionaryService.post(DICTIONARY_PREFIX + dictName + "/count", query, Long.class);
    }

    @GetMapping("/{dictName}")
    public Row[] getByCodes(@PathVariable String dictName, @RequestParam List<String> codes) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromPath(DICTIONARY_PREFIX + dictName);
        codes.forEach(code -> uriBuilder.queryParam("codes", code));
        return dictionaryService.get(uriBuilder.toUriString(), Row[].class);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Platform V";
    }


}

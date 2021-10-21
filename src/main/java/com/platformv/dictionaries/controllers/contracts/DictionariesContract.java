package com.platformv.dictionaries.controllers.contracts;

import com.platformv.dictionaries.configuration.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sbrf.ufs.provider.api.dto.dictionary.CountQueryRequest;
import ru.sbrf.ufs.provider.api.dto.dictionary.QueryRequest;
import ru.sbrf.ufs.provider.api.dto.dictionary.Row;

import java.util.List;

@Api(tags = {SwaggerConfig.DICTIONARIES_TAG})
public interface DictionariesContract {

    String dictionariesNames = "Примеры наименования справочника:\n" +
            "OKEI\n" +
            "OKVED\n" +
            "OKOPF\n";

    String attributes = "Пример атрибутов: \n" +
            "nationalCode\n" +
            "code\n" +
            "nationalSymbol\n" +
            "internationalCode\n" +
            "name\n" +
            "internationalSymbol";

    @ApiOperation("Поиск строк справочника")
    Row[] getRows(@ApiParam(value = dictionariesNames) @PathVariable String dictName,
                  @ApiParam(value = attributes) @RequestBody QueryRequest query);

    @ApiOperation("Поиск строки справочника")
    Row getRow(@ApiParam(value = dictionariesNames) @PathVariable String dictName,
               @ApiParam(value = attributes) @RequestBody QueryRequest query);

    @ApiOperation("Получение числа строк справочника, удовлетворяющих фильтру")
    Long getCount(@ApiParam(value = dictionariesNames) @PathVariable String dictName,
            @ApiParam(value = "Пример: \n" +
                    "\"filter\": null")
            @RequestBody CountQueryRequest query);

    @ApiOperation("Получение строк справочника по наименованию и коду")
    Row[] getByCodes(@ApiParam(value = dictionariesNames) @PathVariable String dictName,
            @ApiParam(value = "Примеры кода справочника:\n" +
                            "для OKEI - 003, 004, 005\n" +
                            "для OKVED - A, A.01, A.01.1\n" +
                            "для OKOPF - 10000, 11000, 12000\n") @RequestParam List<String> codes);
}

package ru.investing_portal.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.investing_portal.models.domain.FiatCurrency;

import java.util.List;

@RequestMapping("/fiat_currency")
public interface FiatCurrencyController {

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    FiatCurrency read(@PathVariable("id") int id);

    @GetMapping(value = "/list", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    List<FiatCurrency> readAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer pageNum,
                               @RequestParam(value = "per_page", defaultValue = "25", required = false) Integer perPage);

}
package com.curso.fullstack.back.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class ClienteRestController  {
    @GetMapping("/nombre")
public Map<String,String> programa(){
    Map <String, String> response= new HashMap<>();
    response.put("Nombre", "Angel");
    response.put("Apellido", "Rojas");
    return response;

}
}

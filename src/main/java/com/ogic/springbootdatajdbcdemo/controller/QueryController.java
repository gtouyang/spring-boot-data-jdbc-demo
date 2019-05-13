package com.ogic.springbootdatajdbcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class QueryController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/query")
    public List<Map<String, Object>> allDepartment(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM department");
        return list;
    }
}

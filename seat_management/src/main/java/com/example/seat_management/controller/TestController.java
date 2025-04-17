package com.example.seat_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String testConnection() {
        try {
            jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return "資料庫連線成功！";
        } catch (Exception e) {
            return "資料庫連線失敗：" + e.getMessage();
        }
    }
}

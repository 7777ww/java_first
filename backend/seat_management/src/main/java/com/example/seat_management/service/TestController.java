package com.example.seat_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test-sql")
    public String testSqlConnection() {
        try {
            // 執行簡單 SQL 查詢
            String result = jdbcTemplate.queryForObject("SELECT NOW()", String.class);
            return "✅ 成功連接資料庫！目前時間：" + result;
        } catch (Exception e) {
            // 失敗時回傳錯誤訊息
            return "❌ 無法連接資料庫： " + e.getMessage();
        }
    }
}

package com.willy.spring.swagger.controller;

import com.willy.spring.swagger.model.Staff;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "員工管理", description = "員工管理 API")
@RestController
@RequestMapping(value = "/api/staffs")
public class StaffController {

    @Operation(summary = "員工列表")
    @GetMapping
    public List<Staff> findAll() {
        return List.of(new Staff(), new Staff());
    }

    @Operation(summary = "新增員工", description = "新增員工 note")
    @PostMapping()
    public Staff addStaff(@RequestBody Staff s) {
        return s;
    }

    @Hidden
    @DeleteMapping(value = "/{id}")
    public void deleteStaff(@PathVariable Integer id) {
    }

}

package com.willy.spring.swagger.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "員工資料")
public class Staff {

    @Schema(example = "willy@willy.com", description = "信箱")
    private String email;
    @Schema(description = "密碼")
    private String password;

}

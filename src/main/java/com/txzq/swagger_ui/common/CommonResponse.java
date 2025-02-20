package com.txzq.swagger_ui.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "API response")
public class CommonResponse {
    @Schema(description = "response code", example = "200")
    private int code;
    @Schema(description = "response message", example = "successful operation")
    private String message;
    // 根据需要添加其他字段
}


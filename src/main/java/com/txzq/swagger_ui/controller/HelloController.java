package com.txzq.swagger_ui.controller;


import com.txzq.swagger_ui.common.CommonResponse;
import com.txzq.swagger_ui.common.FileUploadRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Swagger UI in Spring Boot 3!";
    }

    @Operation(
            summary = "uploads an image",
            description = "",
            operationId = "uploadImage",
            tags = {"User API"},
            parameters = {@Parameter(
                    name = "userId",
                    in = ParameterIn.PATH,
                    description = "ID of User to update",
                    required = true,
                    schema = @Schema(
                            type = "integer",
                            format = "int64"))},
            requestBody = @RequestBody(
                    description = "Additional information and image to upload",
                    required = false,
                    content = @Content(
                            mediaType = "multipart/form-data",
                            schema = @Schema(
                                    type = "object",
                                    implementation = FileUploadRequest.class))),
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "successful operation",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = CommonResponse.class)))})
    @PostMapping("/{userId}/uploadImage")
    public ResponseEntity<CommonResponse> uploadImage(
            @PathVariable("userId") Long userId,
            @RequestPart("uploadRequest") FileUploadRequest uploadRequest)
    {
       return ResponseEntity.ok(new CommonResponse());
    }
}

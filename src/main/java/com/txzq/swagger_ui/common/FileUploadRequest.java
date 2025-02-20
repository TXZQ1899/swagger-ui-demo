package com.txzq.swagger_ui.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FileUploadRequest {
    @Schema(description = "User's avatar")
    private String avatar;

    @Schema(description = "Provide the user's Nick Name")
    private String nickname;

    @Schema(description = "image to upload", type = "string", format = "binary")
    private MultipartFile image;
}


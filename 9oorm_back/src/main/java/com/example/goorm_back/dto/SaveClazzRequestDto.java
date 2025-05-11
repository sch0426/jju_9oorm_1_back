package com.example.goorm_back.dto;

import com.example.goorm_back.domain.clazz.Category;
import lombok.Data;

@Data
public class SaveClazzRequestDto {
    private Long clazzId;
    private String clazzTitle;
    private String clazzDescription;
    private Long clazzPrice;
    private String clazzProfileImage;
    private String latitude;
    private String longitude;
    private Category category;
}

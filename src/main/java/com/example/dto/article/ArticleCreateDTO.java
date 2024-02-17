package com.example.dto.article;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArticleCreateDTO {

    @Size(min = 2, message = "Title should not be empty")
    @NotBlank(message = "Title should not be empty")
    private String title;

    @Size(min = 5, message = "Description should not be empty")
    @NotBlank(message = "Description should not be empty")
    private String description;

    @Size(min = 5, message = "Content should not be empty")
    @NotBlank(message = "Content should not be empty")
    private String content;

    @Min(value = 1, message = "RegionId should not be less than 1")
    private Integer regionId;

    @Min(value = 1, message = "CategoryId should not be less than 1")
    private Integer categoryId;

    private List<Integer> articleType;

    private String photoId;
}

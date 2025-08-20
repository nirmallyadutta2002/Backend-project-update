package com.api.blog.paylode;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
@JsonPropertyOrder({ "category_id", "title", "description" })
public class Category_dto {
    private int Category_id;
    @NotEmpty
    @Size(min=5)
    private String title;
    @NotEmpty
    @Size(min=20)
    private String description;
}

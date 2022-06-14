package com.example.tinkoffservice.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Data
@RequiredArgsConstructor
@Builder
public class FigiesDto {
    private List<String> figies;
}

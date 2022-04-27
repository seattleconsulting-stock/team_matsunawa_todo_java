package com.example.demo;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoForm {
    private long Id;

    @NotNull
    @Size(min = 1, max =30)
    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deadline;

    private boolean status;
}

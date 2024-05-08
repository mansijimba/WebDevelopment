package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookPojo {private Integer id;
    private String date;

    private Integer ground_id;

    private Integer user_id;
}

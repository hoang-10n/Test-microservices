package com.test.child_producer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Child {
    private Integer id;
    private String name;
    private Integer age;
    private Integer parentId;
}

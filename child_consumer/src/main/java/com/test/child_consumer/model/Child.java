package com.test.child_consumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "\"child\"")
public class Child {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private Integer parentId;
}

package com.zempty.springbootjpa.entity.inheritance.single_table;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Setter
@Getter
@Accessors(chain = true)
@Entity
@DiscriminatorValue("a1")
public class A1 extends Group1 {

    private String test;
}

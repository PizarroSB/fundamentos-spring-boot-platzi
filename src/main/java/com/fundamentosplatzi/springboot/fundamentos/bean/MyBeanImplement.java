package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.springframework.stereotype.Component;


public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion propia de mi bean");
    }
}

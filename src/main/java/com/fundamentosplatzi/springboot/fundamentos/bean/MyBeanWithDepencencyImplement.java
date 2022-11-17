package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDepencencyImplement implements MyBeanWithDependency{
    MyOperation myOperation;

    Log LOGGER = LogFactory.getLog(MyBeanWithDepencencyImplement.class);
    public MyBeanWithDepencencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metodo printWithDependency");
        int numero = 1;
        LOGGER.debug("El numero enviado como parametro a la dependencia operacion es: "+ numero);
        int resultado = myOperation.sum(numero);
        System.out.println("Hola desde la implementacion de un bean con dependencia y el resultado es "+resultado);
    }
}

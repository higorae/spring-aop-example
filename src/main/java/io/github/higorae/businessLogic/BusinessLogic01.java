package io.github.higorae.businessLogic;

import io.github.higorae.service.Logger;

import org.springframework.stereotype.Component;

@Component
public class BusinessLogic01 {

	public void anotherThing(){
        Logger.log(this.getClass().getName());
        //Some code..
    }
}

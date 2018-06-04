package ru.ioleksiv.telegram.bot.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Bot {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                MyConfiguration.class);
        String service = ctx.getBean(String.class);


        System.out.println(service);
        ctx.close();
    }
}

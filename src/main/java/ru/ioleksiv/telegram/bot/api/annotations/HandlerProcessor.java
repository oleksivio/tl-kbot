package ru.ioleksiv.telegram.bot.api.annotations;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Scope;

import java.lang.reflect.Method;

import ru.ioleksiv.telegram.bot.api.telegram.model.Update;

@Scope(value = "singleton")
public class HandlerProcessor {
    
    
    
    public void registerMessageHandler(Object instance, Method method){
        
    }
    
    
    public void process(@NotNull Update update){
        
    }
}

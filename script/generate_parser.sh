#!/bin/bash
IN=$1
FN=$2
FPN=${FN}"FilterParser"
OUT="/home/ioleksiv/IdeaProjects/telegram/telegram-spring-api/src/main/java/ru/ioleksiv/telegram/bot/core/controller/annotations/parser/filter/"${FPN}".java"

echo "" > $OUT
echo "package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter;


import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.AnnotationFinderder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import java.util.Optional;

@Component
public class $FPN extends FilterParser<${FN}Filter, ${FN}> { 

     @Override 
     public Checker<${FN}> createChecker(${FN}Filter annotation, Finder finder) {
         UnionExtractValidator<${FN}> unionExtractValidator = new UnionExtractValidator<>();
                 ">> $OUT
                 
cat $IN | grep '  \* @see' | awk '{ print "         "$3" "$4" = annotation."$4"(); \n if("$4".value().isActive()) { \n unionExtractValidator.add(in -> Optional.ofNullable(in.get"toupper(substr($4,1,1)) substr($4,2)"()), finder.find("$4"));\n}" }' >> $OUT

echo "
        return unionExtractValidator;
        }


    @Override
    public Class<${FN}Filter> getAnnotationClass() {
         return ${FN}Filter.class;
     }

 }
">> $OUT

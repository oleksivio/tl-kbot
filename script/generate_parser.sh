#!/bin/bash
IN=$1
FN=$2
FPN=${FN}"FilterParser"
OUT="/home/ioleksiv/IdeaProjects/telegram/telegram-spring-api/src/main/java/ru/ioleksiv/telegram/bot/core/controller/annotations/parser/filter/"${FPN}".java"

echo "" > $OUT
echo "package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter;


import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;
import java.util.Optional;

@Component
public class $FPN extends FilterParser<${FN}Filter, ${FN}> { 

     @Override 
     public Checker<${FN}> createChecker(${FN}Filter annotation, Finder finder) { 
         UnionExtractChecker<${FN}> unionExtractChecker = new UnionExtractChecker<>();
                 ">> $OUT
                 
cat $IN | grep '  \* @see' | awk '{ print "         "$3" "$4" = annotation."$4"(); \n if("$4".value().isActive()) { \n unionExtractChecker.add(in -> Optional.ofNullable(in.get"toupper(substr($4,1,1)) substr($4,2)"()), finder.find("$4"));\n}" }' >> $OUT

echo "
        return unionExtractChecker;
        }


    @Override
    public Class<${FN}Filter> getAnnotationClass() {
         return ${FN}Filter.class;
     }

 }
">> $OUT

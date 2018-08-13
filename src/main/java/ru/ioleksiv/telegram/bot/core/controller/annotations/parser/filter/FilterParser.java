package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter;

import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.Parser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

import java.lang.annotation.Annotation;

public abstract class FilterParser<A extends Annotation, IN> implements Parser<A> {

    public abstract Checker<IN> createChecker(A annotation, Finder finder);

}

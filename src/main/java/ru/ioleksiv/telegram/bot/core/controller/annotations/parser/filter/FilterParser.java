package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter;

import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.Parser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

import java.lang.annotation.Annotation;

public interface FilterParser<A extends Annotation, IN> extends Parser<A> {

    Checker<IN> createChecker(A annotation, Finder finder);

}

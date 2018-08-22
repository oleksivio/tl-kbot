package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter;

import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.Parser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

import java.lang.annotation.Annotation;

public interface FilterParser<A extends Annotation, IN> extends Parser<A> {

    Validator<IN> createChecker(A annotation,
                                Finder finder);
}

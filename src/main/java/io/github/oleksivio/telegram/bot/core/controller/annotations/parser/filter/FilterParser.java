package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter;

import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.Parser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;

import java.lang.annotation.Annotation;

public interface FilterParser<A extends Annotation, IN> extends Parser<A> {

    Validator<IN> createChecker(A annotation,
                                Finder finder);

}

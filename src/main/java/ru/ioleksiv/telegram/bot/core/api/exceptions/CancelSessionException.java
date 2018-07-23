package ru.ioleksiv.telegram.bot.core.api.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CancelSessionException extends RuntimeException {
    private static final Logger LOG = LoggerFactory.getLogger(CancelSessionException.class);
}

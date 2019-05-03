package com.yoclabo.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SessionLogger {

    private Logger l;

    public void error(String message) {
        l = LogManager.getLogger("ErrorLog");
        l.error(message);
    }

    public void error(String message, Exception e) {
        message += "\n" + e.getMessage() + "\n" + e.getStackTrace();
        error(message);
    }

    public void warn(String message) {
        l = LogManager.getLogger("WarnLog");
        l.warn(message);
    }

    public void warn(String message, Exception e) {
        message += "\n" + e.getMessage() + "\n" + e.getStackTrace();
        warn(message);
    }

    public void info(String message) {
        l = LogManager.getLogger("InfoLog");
        l.info(message);
    }

    public void info(String message, Exception e) {
        message += "\n" + e.getMessage() + "\n" + e.getStackTrace();
        info(message);
    }
}
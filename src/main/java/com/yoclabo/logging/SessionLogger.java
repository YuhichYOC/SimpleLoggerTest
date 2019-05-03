/*
 *
 * SessionLogger.java
 *
 * Copyright 2019 Yuichi Yoshii
 *     吉井雄一 @ 吉井産業  you.65535.kir@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

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
package com.kodilla.patterns.singleton;

public enum Logger {

    LOG("Wednesday");

    private String lastLog = "";

    Logger(String lastLog) {
        this.lastLog = lastLog;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}



/* public class Logger {

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
 */

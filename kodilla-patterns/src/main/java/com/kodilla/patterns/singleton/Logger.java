package com.kodilla.patterns.singleton;

public enum Logger {

    LOG1("LOG1"),
    LOG2("LOG2"),
    LOG3("LOG3");

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

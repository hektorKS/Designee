package com.hektorKS.Creational.Singleton;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Singleton design pattern (called anti-pattern)
 * The best way to implement singleton is by using enum.
 * It's worth to remember that when we serialize an enum, field variables are not getting serialized.
 * ---------------------------------------------------------------------------------------------------------------------
 * Logging is a specific example of an "acceptable" Singleton because it doesn't affect the execution of your code.
 * Disable logging, code execution remains the same. Enable it, same same.
 * "The information here flows one way: From your application into the logger. Even though loggers are global state,
 * since no information flows from loggers into your application, loggers are acceptable."
 * ---------------------------------------------------------------------------------------------------------------------
 * public enum Logger {
 * INSTANCE;
 * }
 *
 * is internally treated like
 *
 * public class Logger {
 * private static final Logger INSTANCE = new Logger();
 * }
 */
public enum Logger {

    INSTANCE;

    private String log;

    public void addToLog(String data){
        if(log == null){
            log = data;
        }
        else{
            log = log + data;
        }
    }

    public void saveLog(){
        if(log != null){
            try {
                PrintWriter out = new PrintWriter("logfile.txt");

                out.println(log);
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    }


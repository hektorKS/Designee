package main.java.Creational.Singleton;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
 *
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

    private String readContent() throws IOException {
        String result = new String(Files.readAllBytes(Paths.get("logfile.txt")));

        return result;
    }


    private void currentLogOnTop(String data) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n-----------------------------------------------------------------------------------------------\n");
        stringBuilder.append("\nLog time: ");
        stringBuilder.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
        stringBuilder.append("\n.............................\n");
        stringBuilder.append(log);
        stringBuilder.append(data);

        log = stringBuilder.toString();

    }



    public void saveLog(){
        if(log != null){

            try {
                String fileContent = readContent();
                currentLogOnTop(fileContent);

                PrintWriter out = new PrintWriter("logfile.txt");

                out.println(log);
                out.close();
                log = "";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    }


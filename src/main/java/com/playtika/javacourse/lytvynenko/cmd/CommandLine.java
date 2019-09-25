package com.playtika.javacourse.lytvynenko.cmd;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CommandLine {
    private  CommandFactory commandFactory = new CommandFactory();

    public void run (Scanner scanner){
        Context context = new Context();
        context.setPath(Paths.get("").toAbsolutePath());
        do{

            System.out.printf("<%s>", context.getPath());
            String input = scanner.nextLine();
            try {
                commandFactory.getCommand(input).execute(context);
            } catch (IOException e) {
                System.out.println("something went wrong" + e);
            }

        } while (true);
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();
        commandLine.run(new Scanner(System.in));
    }

}


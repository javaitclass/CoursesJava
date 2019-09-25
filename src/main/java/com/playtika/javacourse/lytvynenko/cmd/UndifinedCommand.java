package com.playtika.javacourse.lytvynenko.cmd;

import java.io.IOException;

public class UndifinedCommand implements Command {
    @Override
    public void execute(Context context) throws IOException {
        System.out.println("Unknown command");
    }
}

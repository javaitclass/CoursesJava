package com.playtika.javacourse.lytvynenko.cmd;

import java.io.IOException;

public class EchoCommand implements Command {
    private  String [] args;

    public EchoCommand (String[]  args){
        this.args = args;
    }
    @Override
    public void execute(Context context) throws IOException {
        if (args.length > 1){
            System.out.println(args[1]);
        }
        System.out.println();
    }
}

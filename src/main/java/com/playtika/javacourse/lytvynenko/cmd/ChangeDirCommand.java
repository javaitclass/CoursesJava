package com.playtika.javacourse.lytvynenko.cmd;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChangeDirCommand implements Command {
    private String[] args;

    public ChangeDirCommand(String[] args) {
        this.args = args;
    }

    @Override
    public void execute(Context context) {
        if (args.length != 2){
            System.out.println("expected 1 argument");
            return;
        }

        Path newPass = Paths.get(args[1]);
        if(!newPass.isAbsolute()){
            newPass = context.getPath().resolve(newPass).normalize().toAbsolutePath();

        }

        if(Files.isDirectory(newPass)){
            context.setPath(newPass);
        } else{
            System.out.println("Directory not exist" + newPass.toString());
        }
    }
}

package com.playtika.javacourse.lytvynenko.cmd;

import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeDirCommand implements Command {
    private Path path;

    public ChangeDirCommand(Path path) {
        this.path = path;
    }

    @Override
    public void execute(Context context) {
        Path newPass;
        if(path.isAbsolute()){
            newPass = path;
            context.setPath(path);
        } else{
             newPass = context.getPath().resolve(path).toAbsolutePath();
        }
        if(Files.isDirectory(newPass)){
            context.setPath(newPass);
        } else{
            System.out.println("Directory not exist" + newPass.toString());
        }
    }
}

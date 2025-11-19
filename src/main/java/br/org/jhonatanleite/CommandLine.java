package br.org.jhonatanleite;

import java.io.File;

public class CommandLine {
    private final String command;
    private final File file;

    public CommandLine(String command, File file) {
        this.command = command;
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public String getCommand() {
        return command;
    }

}

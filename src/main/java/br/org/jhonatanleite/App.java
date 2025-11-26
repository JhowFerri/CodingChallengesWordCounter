package br.org.jhonatanleite;

import java.io.File;

public class App {

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(args[0], new File(args[1]));
        WordCounterService wcService = new WordCounterService();
        System.out.println(wcService.countBytes(commandLine) + " " + commandLine.getFile().getName());

        //TESTE
    }
}

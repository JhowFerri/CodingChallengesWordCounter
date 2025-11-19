package br.org.jhonatanleite;

import java.io.*;

public class WordCounterService {

    public long countBytes(CommandLine commandLine) {
        return commandLine.getFile().length();
    }

    public long countLines(CommandLine commandLine) throws IOException {
        File file = commandLine.getFile();
        BufferedReader br = new BufferedReader(new FileReader(file));
        long lineCounter = 0;
        String line = "";
        while ((line = br.readLine()) != null) {
            lineCounter++;
        }
        return lineCounter;
    }
}

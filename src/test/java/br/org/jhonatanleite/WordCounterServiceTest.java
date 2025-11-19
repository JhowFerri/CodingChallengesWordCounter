package br.org.jhonatanleite;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class WordCounterServiceTest {

    CommandLine commandLine;
    WordCounterService wcService;

    @Before
    public void init(){
        commandLine = new CommandLine("-c", new File("/home/jhonatan/Downloads/test.txt"));
        wcService = new WordCounterService();
    }

    @Test
    public void countBytesTest(){
        assertEquals(342190, (long) wcService.countBytes(commandLine));
    }

    @Test
    public void countLinesTest() throws IOException {
        assertEquals(7145, wcService.countLines(commandLine));
    }
}

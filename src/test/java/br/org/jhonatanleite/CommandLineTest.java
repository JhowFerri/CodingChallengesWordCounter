package br.org.jhonatanleite;


import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommandLineTest {

    CommandLine commandLine;

    @Before
    public void init(){
        commandLine = new CommandLine("-c", new File("/home/jhonatan/Downloads/test.txt"));
    }

    @Test
    public void fileTest(){
        assertTrue(commandLine.getFile().isFile());
    }

    @Test
    public void commandTest(){
        assertEquals("-c", commandLine.getCommand());
    }

}

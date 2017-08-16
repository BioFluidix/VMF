package eu.mihosoft.vmf.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Sam
 * @author Michael Hoffer (info@michaelhoffer.de)
 */
public class FileResource implements Resource {

    //
    // thanks to Sam for designing this interface
    //
    final File file;
    FileWriter fileWriter;

    public FileResource(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    @Override
    public PrintWriter open() throws IOException {

        return new PrintWriter(fileWriter = new FileWriter(file));
    }

    @Override
    public void close() throws IOException {
        fileWriter.close();
    }

}

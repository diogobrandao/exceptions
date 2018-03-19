package org.academiadecodigo.bootcamp;

public class FileNotFoundException extends FileException {
    public FileNotFoundException(String s) {
        super("file" + s + "wasn't found.");
    }
}

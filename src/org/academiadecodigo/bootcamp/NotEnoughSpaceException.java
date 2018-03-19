package org.academiadecodigo.bootcamp;

public class NotEnoughSpaceException extends FileException {


    public NotEnoughSpaceException() {
        super("You can't add any more files");

    }
}

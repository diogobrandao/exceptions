package org.academiadecodigo.bootcamp;

public class NotEnoughPermissionsException extends FileException {
    public NotEnoughPermissionsException() {
        super("You dont have the necessary permission");
    }
}

package org.academiadecodigo.bootcamp;

public class FileManager {

    private boolean loggedIn;
    private File[] file = new File[4];


    public void login() {
        if(loggedIn == true){
            System.out.println("you're logged in");
        }

    }

    public void logout() {
        if(loggedIn == false) {
            System.out.println("you're logged out");
        }

    }

    public File getName(File name) {
        return name;
    }

    public void createFile() throws NotEnoughSpaceException{
        for(int i = 0; i < file.length; i++) {
            File file = null;
            if(file[i] > ){
                throw new NotEnoughSpaceException();
            }

        } if(file == null) {
            throw new FileNotFoundException(name);
        }
        return;
                                 // file counter == files.length;
    }
}

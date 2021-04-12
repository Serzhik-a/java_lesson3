package ru.lesson3.homeworkPro;

public class FileReadNumberExeption extends Exception {

    private Integer indexOfdigit;
    private String message;

    public Integer getIndex() {
        return indexOfdigit;
    }

    public String getMessage() {
        return message;
    }

    public FileReadNumberExeption(String message, Integer number) {
        super(message);
        this.message = message;
        this.indexOfdigit = number;
    }
}

package ru.netology.java14.tournament;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name) {
        super("Игрок не зарегистрирован" + name);
    }

}

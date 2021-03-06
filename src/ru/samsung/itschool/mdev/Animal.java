package ru.samsung.itschool.mdev;

public class Animal<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

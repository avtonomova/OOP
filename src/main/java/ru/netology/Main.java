package ru.netology;

import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.birthday= new FormDate();
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

    }
}
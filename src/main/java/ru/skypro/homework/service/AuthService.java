package ru.skypro.homework.service;

import ru.skypro.homework.dto.account.Register;

public interface AuthService {
    boolean login(String userName, String password);
    boolean register(Register register);

}

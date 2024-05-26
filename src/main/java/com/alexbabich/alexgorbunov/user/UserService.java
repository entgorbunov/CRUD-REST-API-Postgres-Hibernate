package com.alexbabich.alexgorbunov.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        log.info("Получаем всех пользователей");
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        log.info("Получаем пользователя с ID: {}", id);
        return userRepository.findById(id);
    }

    public User create(User user) {
        log.info("Создаем нового пользователя");
        return userRepository.save(user);
    }

    public User update(User user) {
        log.info("Обновляем пользователя с ID: {}", user.getId());
        return userRepository.save(user);
    }

    @Transactional
    public void delete(Long id) {
        log.info("Удаляем пользователя с ID: {}", id);
        userRepository.deleteById(id);
    }
}

package com.alexbabich.alexgorbunov.user;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaAttributeConverter<User, Long> {


    List<User> findAll();

    List<Object> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}

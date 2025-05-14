package org.example.helloworld.configuration;

import org.example.helloworld.models.Users;
import org.example.helloworld.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void run(String... args) throws Exception {
        Users usuario1 = new Users(null, "Isadora", "isadora@email", "xxxxxxxx");
        Users usuario2 = new Users(null, "Mariana", "mariana@email", "xxxxxxxx");
        Users usuario3 = new Users(null, "Isabela", "isabela@email", "xxxxxxxx");
        Users usuario4 = new Users(null, "Lua", "lua@email", "xxxxxxxx");

        // usersRepository.save(usuario1);
        // usersRepository.save(usuario2);

        usersRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3, usuario4)); // para salvar tudo de vez
    }
}

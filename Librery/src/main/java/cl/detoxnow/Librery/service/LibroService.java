package cl.detoxnow.Librery.service;

import cl.detoxnow.Librery.model.Libro;
import cl.detoxnow.Librery.repository.LibroRepository;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class LibroService {
    @Autowired
    private LibroRepository menuRepository;

    public List<Libro> getMenus() {
        Libro l0 = new Libro();
        List<Libro> lm0 = new ArrayList<Libro>();
        l0.setId(100);
        l0.setTitulo("Libro 100");
        l0.setAutor("Vicente Avileichon");
        l0.setFechaPublicacion(java.time.LocalDateTime.now());
        System.out.println(l0.getCreatedAt().toString());
        lm0.add(l0);
        System.out.println("lm0");
        System.out.println(lm0.toString());

        List<Libro> lm1 = menuRepository.findAll();
        System.out.println("lm1");
        System.out.println(lm1.toString());

        List<Libro> lm2 = menuRepository.findAllMenus();
        System.out.println("lm2");
        System.out.println(lm2.toString());

        return lm1;

        // return menuRepository.findAll();
    }

    public Libro findMenuById(int id) {
        return menuRepository.findById(id).orElse(null);
    }

    public Libro addMenu(Libro libro) {
        return LibroRepository.save(libro);
    }

    public Libro updateMenu(Libro libro) {
        return LibroRepository.save(libro);
    }

    public void deleteMenu(int id) {
        LibroRepository.deleteById(id);
    }
}
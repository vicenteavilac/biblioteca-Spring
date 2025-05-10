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
    private LibroRepository LibroRepository;

    public List<Libro> getMenus() {
        // Libro l0 = new Libro();
        // List<Libro> lm0 = new ArrayList<Libro>();
        // l0.setId(100);
        // l0.setTitulo("Libro 100");
        // l0.setAutor("Vicente Avileichon");
        // l0.setFechaPublicacion(java.time.LocalDateTime.now());
        // System.out.println(l0.getCreatedAt().toString());
        // lm0.add(l0);
        // System.out.println("lm0");
        // System.out.println(lm0.toString());

        // List<Libro> lm1 = menuRepository.findAll();
        // System.out.println("lm1");
        // System.out.println(lm1.toString());

        // List<Libro> lm2 = LibroRepository.findAllMenus();
        // System.out.println("lm2");
        // System.out.println(lm2.toString());

        // return lm1;

        return LibroRepository.findAll();
    }

    public Libro GetLibroById(int id) {
        return LibroRepository.findById(id).orElse(null);
    }

    public Libro saveLibro(Libro libro) {
        return LibroRepository.save(libro);
    }
    
    public Libro actualizarLibro(Libro libro) {
        return LibroRepository.save(libro);
    }

    public void deleteLibro(int id) {
        LibroRepository.deleteById(id);
    }

    public int totalLibrosV2() {
        return (int) LibroRepository.count();
    }

    public List<Libro> listaLibros() {
        return LibroRepository.findAll();
    }

}
package cl.detoxnow.Librery.repository;

import cl.detoxnow.Librery.model.Libro;    
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
  // List<Menu> findAll(); // This method is inherited from JpaRepository

    List<Libro> findByName(String name); // This method is inherited from JpaRepository

    List<Libro> findByCreatedAt(LocalDateTime createdAt); // This method is inherited from JpaRepository

    @Query("SELECT m FROM Menu m WHERE m.name LIKE '%:pattern%'")
    List<Libro> findByNameLike(String pattern); // Custom query to find menus by name pattern

    @Query(value = "select * from menu", nativeQuery = true)
    List<Libro> findAllMenus(); // Custom query to find all menus
}
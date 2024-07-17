package br.com.douglasbello.spring_cache.repositories;

import br.com.douglasbello.spring_cache.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
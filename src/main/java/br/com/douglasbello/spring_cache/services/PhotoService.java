package br.com.douglasbello.spring_cache.services;

import br.com.douglasbello.spring_cache.entities.Photo;
import br.com.douglasbello.spring_cache.repositories.PhotoRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    private final PhotoRepository photoRepository;

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public void saveAll(List<Photo> photos) {
        photoRepository.saveAll(photos);
    }

    public List<Photo> findAll() {
        return photoRepository.findAll();
    }
}
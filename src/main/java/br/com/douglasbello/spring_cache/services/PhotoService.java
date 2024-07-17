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

    @CacheEvict(value = "photosCache", allEntries = true)
    public void saveAll(List<Photo> photos) {
        photoRepository.saveAll(photos);
    }

    @Cacheable("photosCache")
    public List<Photo> findAll() {
        return photoRepository.findAll();
    }
}
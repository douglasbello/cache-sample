package br.com.douglasbello.spring_cache.controllers;

import br.com.douglasbello.spring_cache.entities.Photo;
import br.com.douglasbello.spring_cache.services.PhotoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/photos")
public class PhotoController {
    private final PhotoService photoService;

    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping
    public ResponseEntity<List<Photo>> findAll() {
        return ResponseEntity.ok().body(photoService.findAll());
    }

    @PostMapping
    public ResponseEntity<Void> saveAll(@RequestBody List<Photo> photos) {
        photoService.saveAll(photos);

        return ResponseEntity.noContent().build();
    }
}
package com.anushka.notesinfo.controllers;


import com.anushka.notesinfo.models.Notes;
import com.anushka.notesinfo.repositories.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class NotesController {


    @Autowired
    NotesRepo repo;

    @GetMapping(path="/notes")
    public List<Notes> getAllNotes()
    {
        return repo.findAll();
    }

//    @GetMapping(path="/notes/{title}")
//    public Notes getByTitle(@PathVariable(name = "title") String title)
//    {
//        return repo.findByTitle(title);
//    }


    @GetMapping(path="/notes/email/{email}")
    public List<Notes> getByMail(@PathVariable(name="email") String email)
    {
       return repo.findByEmail(email);
    }



    @GetMapping(path="/notes/{id}")
    public Optional<Notes> fetchNote(@PathVariable String id)
    {
        return repo.findById(id);
    }


}

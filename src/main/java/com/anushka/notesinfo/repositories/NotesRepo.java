package com.anushka.notesinfo.repositories;


import com.anushka.notesinfo.models.Notes;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
@Configuration
public interface NotesRepo extends MongoRepository<Notes,String> {

   List<Notes> findByEmail(String email);
   Notes findByTitle(String title);

}

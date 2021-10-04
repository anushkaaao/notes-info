package com.anushka.notesinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 // import com.mongodb.*;
 // import com.mongodb.client.MongoClients;
 // import com.mongodb.client.MongoClient;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;



@SpringBootApplication
public class NotesInfoApplication {

    public static void main(String[] args) {
//        MongoClient mongoClient = MongoClients.create("mongodb://sundaram:14kbEdiuz9GDn75IjOt7PfR81VEGeqSh8GyTSS63ZE5HBLdAPPaBepSKPcM83zXoxUzdGWer7xwK2fU9NE4ntg==@sundaram.mongo.cosmos.azure.com:10255/?ssl=true&retrywrites=false&replicaSet=globaldb&maxIdleTimeMS=120000&appName=@sundaram@");
//        // MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://sundaram:14kbEdiuz9GDn75IjOt7PfR81VEGeqSh8GyTSS63ZE5HBLdAPPaBepSKPcM83zXoxUzdGWer7xwK2fU9NE4ntg==@sundaram.mongo.cosmos.azure.com:10255/?ssl=true&retrywrites=false&replicaSet=globaldb&maxIdleTimeMS=120000&appName=@sundaram@"));
//        // System.out.println(client);
//        MongoDatabase database = mongoClient.getDatabase("anushka");
//        MongoCollection<Document> collection = database.getCollection("test");
//        
//         Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
//                .append("info", new Document("x", 203).append("y", 102));
//        collection.insertOne(doc);
        SpringApplication.run(NotesInfoApplication.class, args);

    }

}

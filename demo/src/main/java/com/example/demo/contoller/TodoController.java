package com.example.demo.contoller;

import com.example.demo.model.Todoitem;
import com.example.demo.repo.TodoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
public class TodoController {
    @Autowired
    private TodoRepo todorepo;

    @GetMapping
    public List<Todoitem> findall(){
        return todorepo.findAll();
    }

    @PostMapping
    public Todoitem save( @NotNull @RequestBody Todoitem todoitem){
        return todorepo.save(todoitem);
    }
    @PutMapping
    public Todoitem update(@NotNull @RequestBody Todoitem todoitem ){
        return todorepo.save(todoitem);
    }

}

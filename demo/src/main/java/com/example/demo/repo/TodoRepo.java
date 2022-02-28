package com.example.demo.repo;

import com.example.demo.model.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.*;
public interface TodoRepo  extends JpaRepository<Todoitem,Long>{

}

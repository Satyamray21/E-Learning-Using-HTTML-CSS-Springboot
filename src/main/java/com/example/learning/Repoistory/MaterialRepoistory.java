package com.example.learning.Repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.Model.MaterialModel;

@Repository
public interface MaterialRepoistory extends JpaRepository<MaterialModel,Long > {

    
}
    


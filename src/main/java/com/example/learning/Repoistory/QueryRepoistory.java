package com.example.learning.Repoistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.Model.QueryModel;

@Repository
public interface QueryRepoistory extends JpaRepository<QueryModel,Long > {

}

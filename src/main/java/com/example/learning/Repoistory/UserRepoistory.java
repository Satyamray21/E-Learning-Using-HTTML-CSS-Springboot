package com.example.learning.Repoistory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.Model.MaterialModel;
import com.example.learning.Model.UserModel;

@Repository
public interface UserRepoistory extends JpaRepository<MaterialModel,Long > {
    Optional<UserModel> findByUsernameAndPassword(String username, String password);
}

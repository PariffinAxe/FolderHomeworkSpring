package com.codeclan.example.FoldersHomework.repos;

import com.codeclan.example.FoldersHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File, Long> {
}

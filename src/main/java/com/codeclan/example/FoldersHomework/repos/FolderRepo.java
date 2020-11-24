package com.codeclan.example.FoldersHomework.repos;

import com.codeclan.example.FoldersHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Long> {
}

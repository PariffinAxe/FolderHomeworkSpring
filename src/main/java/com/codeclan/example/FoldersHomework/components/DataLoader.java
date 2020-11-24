package com.codeclan.example.FoldersHomework.components;

import com.codeclan.example.FoldersHomework.models.File;
import com.codeclan.example.FoldersHomework.models.Folder;
import com.codeclan.example.FoldersHomework.models.User;
import com.codeclan.example.FoldersHomework.repos.FileRepo;
import com.codeclan.example.FoldersHomework.repos.FolderRepo;
import com.codeclan.example.FoldersHomework.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
  UserRepo userRepo;

  @Autowired
  FolderRepo folderRepo;

  @Autowired
  FileRepo fileRepo;

  public DataLoader(){}

  public void run(ApplicationArguments args){
    User user1 = new User("mike");
    userRepo.save(user1);
    User user2 = new User("john");
    userRepo.save(user2);

    Folder folder1 = new Folder("Work", user1);
    folderRepo.save(folder1);
    Folder folder2 = new Folder("Polo", user1);
    folderRepo.save(folder2);
    Folder folder3 = new Folder("Work", user2);
    folderRepo.save(folder3);

    File file1 = new File("main", "txt", 14, folder1);
    fileRepo.save(file1);
    File file2 = new File("spreadsheet", "xl", 24, folder1);
    fileRepo.save(file2);
    File file3 = new File("tournament", "xl", 100, folder2);
    fileRepo.save(file3);
    File file4 = new File("misc", "txt", 12, folder3);
    fileRepo.save(file4);
  }

}

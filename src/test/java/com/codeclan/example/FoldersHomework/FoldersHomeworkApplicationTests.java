package com.codeclan.example.FoldersHomework;

import com.codeclan.example.FoldersHomework.models.File;
import com.codeclan.example.FoldersHomework.models.Folder;
import com.codeclan.example.FoldersHomework.models.User;
import com.codeclan.example.FoldersHomework.repos.FileRepo;
import com.codeclan.example.FoldersHomework.repos.FolderRepo;
import com.codeclan.example.FoldersHomework.repos.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersHomeworkApplicationTests {

	@Autowired
	UserRepo userRepo;

	@Autowired
	FolderRepo folderRepo;

	@Autowired
	FileRepo fileRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testData(){
		User user = new User("mike");
		userRepo.save(user);

		Folder folder = new Folder("Work", user);
		folderRepo.save(folder);

		File file = new File("work", "txt", 14, folder);
		fileRepo.save(file);
	}



}

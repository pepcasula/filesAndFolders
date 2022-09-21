package com.codeclan.example.filesandfolders;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class FilesandfoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createFile(){
//		File file = new File("Passport Scan", "jpg", 679);
//		fileRepository.save(file);
//	}

}

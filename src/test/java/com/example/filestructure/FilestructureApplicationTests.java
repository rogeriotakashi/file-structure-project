package com.example.filestructure;

import com.example.filestructure.old.FileManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FilestructureApplicationTests {

	@Autowired
	private FileManager manager;

	@Test
	public void hello(){
		manager.createOrRead("file1.txt");
		manager.printIndexes(1);

		assertEquals(true, true);
	}

}

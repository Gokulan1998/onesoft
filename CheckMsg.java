package com.onesoft.collection3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMsg {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\hp\\Desktop\\practice.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}

	}

}

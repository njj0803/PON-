package com.njj.pon.apps;

import com.njj.pon.tools.Tool;

public class App {

	public static void main(String[] args) {
		 long starTime=System.currentTimeMillis();
		Tool tool = new Tool();
		String path = "C:\\Users\\�߾���\\Desktop\\��������_2017-03-29_19-39-16.log";
		tool.splitFile(path,762);
		 long endTime=System.currentTimeMillis();
		 long totalTime = endTime - starTime; 
		 System.out.println("�ѳɹ����ɽű����ܹ���ʱ"+totalTime+"ms");
	}

}

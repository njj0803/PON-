package com.njj.pon.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.njj.pon.beans.ONUInfo;

public class Tool {

	public void readLog(String path) {
		try {
			String encoding = "utf-8";
			
			List<ONUInfo> mapList = new ArrayList<>();
			File file = new File(path);
			if (file.isFile() && file.exists()) { // �ж��ļ��Ƿ����
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);// ���ǵ������ʽ
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					//System.out.println(lineTxt);
					if (lineTxt.contains("ONT-1-1-")&&lineTxt.contains("MACADDR")) {
						ONUInfo onu = new ONUInfo();
						String loid = lineTxt.substring(4,18).replace(':', ' ').trim();
						System.out.println(loid);
						onu.setLoid(loid);
					} 
					
					

				}
				read.close();
			} else {
				System.out.println("�Ҳ���ָ�����ļ�");
			}
		} catch (Exception e) {
			System.out.println("��ȡ�ļ����ݳ���");
			e.printStackTrace();
		}

	}

}

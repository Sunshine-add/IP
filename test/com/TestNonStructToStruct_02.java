package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tledu.zrz.pojo.IPAndLocationPojo;
import com.tledu.zrz.util.FileOperatorUtil;

/**
 * 数据结构化 把数据保存到对象中
 *
 */
public class TestNonStructToStruct_02 {
	public static void main(String[] args) throws IOException {

		String ipLibarayPath = "ip_location_relation.txt";
		String encoding = "utf-8";
		List<String> lineList = FileOperatorUtil.getLineList(ipLibarayPath,
				encoding);
		
		List<IPAndLocationPojo> ipAndLocationPojos = new ArrayList<IPAndLocationPojo>();
		for (String line : lineList) {
			// 如果有空行 直接跳过
			if (line == null || line.trim().equals("")) {
				continue;
			}
			String[] columnArray = line.split("\t");
			String startIP = columnArray[0];
			String endIP = columnArray[1];
			String location = columnArray[2];
			
			// 封装到对象中
			IPAndLocationPojo ipAndLocationPojo = new IPAndLocationPojo(startIP, endIP, location);
			
			ipAndLocationPojos.add(ipAndLocationPojo);
		}
		
		for (IPAndLocationPojo ipAndLocationPojo : ipAndLocationPojos) {
			System.out.println(ipAndLocationPojo);
		}
	}
}

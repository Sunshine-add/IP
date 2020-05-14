package com;

import java.io.IOException;
import java.util.List;

import com.tledu.zrz.manager.DataProcessManager;
import com.tledu.zrz.pojo.IPAndLocationPojo;

/**
 * 数据结构化 把数据保存到对象中
 * 
 *
 */
public class TestNonStructToStruct_03 {
	public static void main(String[] args) throws IOException {

		String ipLibarayPath = "ip_location_relation.txt";
		String encoding = "utf-8";
		List<IPAndLocationPojo> ipAndLocationPojos = DataProcessManager
				.getPojoList(ipLibarayPath, encoding);
		
		for (IPAndLocationPojo ipAndLocationPojo : ipAndLocationPojos) {
			System.out.println(ipAndLocationPojo);
		}

	}
}

package com;

import java.io.IOException;
import java.util.List;

import com.tledu.zrz.util.FileOperatorUtil;

/**
 * 把数据行分为三列
 * 
 *
 */
public class TestNonStructToStruct_01 {
	public static void main(String[] args) throws IOException {

		String ipLibarayPath = "ip_location_relation.txt";
		String encoding = "utf-8";
		List<String> lineList = FileOperatorUtil.getLineList(ipLibarayPath,
				encoding);
		for (String line : lineList) {
			String[] columnArray = line.split("\t");
			for (String col : columnArray) {
				System.out.println(col);
			}
		}

	}
}

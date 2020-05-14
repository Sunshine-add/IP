package com;

import java.io.IOException;
import java.util.List;

import com.tledu.zrz.util.FileOperatorUtil;

public class TestFileIO_02 {
	/**
	 * 1 定义文件路径
	 * 
	 * 2 通过节点流对接到文件上
	 * 
	 * 3 转换为字符流
	 * 
	 * 4 添加缓冲流
	 * 
	 * 5 读取
	 * 
	 * 6 关闭流
	 * 
	 * 先开启的后关闭,关闭最外层的流,会自动关闭内部流
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String ipLibarayPath = "ip_location_relation.txt";
		String encoding = "utf-8";
		List<String> lineList = FileOperatorUtil.getLineList(ipLibarayPath,
				encoding);
		for (String string : lineList) {
			System.out.println(string);
		}

	}
}

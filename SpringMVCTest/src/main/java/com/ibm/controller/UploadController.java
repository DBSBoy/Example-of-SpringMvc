package com.ibm.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class UploadController {

	@RequestMapping("/getPage")
    public String uploadFile() {
        return "uploadFile";
    }
	
	
	@RequestMapping("/upload")
	@ResponseBody
    public Map uploadFile(@RequestParam("myFile") MultipartFile file, HttpServletRequest req)
    		throws IllegalStateException, IOException  {
		Map<String, String> result = new HashMap<String, String>();
		// 判断文件是否为空，空则返回失败页面
		if (file.isEmpty()) {
			result.put("result", "false");
			return result;
		}
		// 获取文件存储路径（绝对路径）
		//String path = req.getServletContext().getRealPath("/WEB-INF/file");
		String path="C:/JMPX/Upload/File";
		// 获取原文件名
		String fileName = file.getOriginalFilename();
		// 创建文件实例
		File filePath = new File(path, fileName);
		// 如果文件目录不存在，创建目录
		if (!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
		}
		System.out.println("文件地址：" + filePath);
		result.put("filePath", filePath+"");
		// 写入文件
		file.transferTo(filePath);
		result.put("result", "true");
        return result;	
    }
}

package com.ycl.files;

import java.io.IOException;

public class demo {
	public static void main(String[] args) {  
        //单个scel文件转化    
        FileProcessing scel=new SougouScelFileProcessing();  
//        scel.parseFile("E:/123456.scel", "E:/123456.txt", true);  
//  
//        //多个scel文件转化为一个txt (格式：拼音字母 词)  
//        try {  
//            scel.parseFiles("/Users/ST_iOS/Desktop/test/ciku", "/Users/ST_iOS/Desktop/test/ciku/txt/汇总.txt", false);  
//        } catch (IOException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        }  
        //多个scel文件转化为多个txt文件  
        scel.setTargetDir("C:/Users/ycl/Desktop/词库/car");//转化后文件的存储位置  
        scel.parseFile("C:/Users/ycl/Desktop/词库/car",false);  
          
    }  

}

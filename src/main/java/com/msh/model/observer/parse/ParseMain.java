package com.msh.model.observer.parse;

import com.alibaba.fastjson.JSON;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ParseMain {

  public static void main(String[] args) throws IOException {
    String path = ParseMain.class.getClassLoader().getResource("").getPath();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path + "observer-parse-content")));
    Parse parse = new Parse();
    String str = bufferedReader.readLine();
    while(null != str){
      parse.readLine(str);
      str = bufferedReader.readLine();
    }
    System.out.println(bufferedReader.readLine());
    bufferedReader.close();
    List<ParseEntity> parseEntities = parse.parseEntity();
    System.out.println(JSON.toJSONString(parseEntities));
  }
}

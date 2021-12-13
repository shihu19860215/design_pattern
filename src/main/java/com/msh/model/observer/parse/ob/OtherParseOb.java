package com.msh.model.observer.parse.ob;

import com.msh.model.observer.parse.IParseOb;
import com.msh.model.observer.parse.Parse;

public class OtherParseOb implements IParseOb {
  private Parse parse;

  public OtherParseOb(Parse parse) {
    this.parse = parse;
  }

  @Override
  public void excue(char c) {
    if(c == '<' || c == '>'){
      return;
    }
    if(parse.isInTag()){
      if(c == ' '){
        throw new RuntimeException(String.format("<内不能有空格,第%s行, '%s'", parse.getLine(), parse.loadLineString()));
      }
      parse.appendTag(c);
      return;
    }
    // <>外不能输入其他字符
    if(c != ' ' && c != '\r' && c!='\n' && c!='\t'){
      throw new RuntimeException(String.format("出现非法字符%s[%d],第%s行, '%s'", c, (int)c, parse.getLine(), parse.loadLineString()));
    }
  }
}
package com.msh.model.observer.parse.ob;

import com.msh.model.observer.parse.IParseOb;
import com.msh.model.observer.parse.Parse;

public class RightAngleBracketParseOb implements IParseOb {
  private Parse parse;

  public RightAngleBracketParseOb(Parse parse) {
    this.parse = parse;
  }

  @Override
  public void excue(char c) {
    if(c != '>'){
      return;
    }
    if(!parse.isInTag()){
      throw new RuntimeException(String.format("缺少开始标签<,第%s行, '%s'", parse.getLine(), parse.loadLineString()));
    }
    parse.toOutTag();
    StringBuilder tag = parse.getTag();
    if(tag.charAt(0) == '/'){
      String curTagName = parse.getCurTagName();
      String substring = tag.substring(1);
      if(!substring.equals(curTagName)){
        throw new RuntimeException(String.format("没有找到对应的前置标签:%s,第%s行, '%s'", substring, parse.getLine(), parse.loadLineString()));
      }
      parse.endEntity();
      return;
    }
    parse.addChildrenEntity();
  }
}

package com.msh.model.observer.parse.ob;

import com.msh.model.observer.parse.IParseOb;
import com.msh.model.observer.parse.Parse;

public class LeftAngleBracketParseOb implements IParseOb {
  private Parse parse;

  public LeftAngleBracketParseOb(Parse parse) {
    this.parse = parse;
  }

  @Override
  public void excue(char c) {
    if(c != '<'){
      return;
    }
    if(parse.isInTag()){
      throw new RuntimeException(String.format("重复的符号<,第%s行, '%s'", parse.getLine(), parse.loadLineString()));
    }
    parse.resetTag();
    parse.toInTag();
  }
}

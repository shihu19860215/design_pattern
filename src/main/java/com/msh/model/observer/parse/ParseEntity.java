package com.msh.model.observer.parse;

import java.util.List;
import lombok.Data;


public class ParseEntity {
  private String name;
  private List<ParseEntity> chirdren;
  private ParseEntity parent;


  public ParseEntity parent(){
    return this.parent;
  }

  public ParseEntity(ParseEntity parent) {
    this.parent = parent;
  }

  public String getName() {
    return name;
  }

  public ParseEntity setName(String name) {
    this.name = name;
    return this;
  }

  public List<ParseEntity> getChirdren() {
    return chirdren;
  }

  public ParseEntity setChirdren(List<ParseEntity> chirdren) {
    this.chirdren = chirdren;
    return this;
  }
}

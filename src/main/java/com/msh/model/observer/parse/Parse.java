package com.msh.model.observer.parse;

import com.msh.model.observer.parse.ob.LeftAngleBracketParseOb;
import com.msh.model.observer.parse.ob.OtherParseOb;
import com.msh.model.observer.parse.ob.RightAngleBracketParseOb;
import java.util.LinkedList;
import java.util.List;

public class Parse {
  /**
   * 读取到第几行
   */
  private int line;
  /**
   * 当前行已读信息
   */
  private StringBuilder load;
  /**
   * 观察者
   */
  private List<IParseOb> parseObList;
  /**
   * 当前解析实体
   */
  private ParseEntity cur;
  /**
   * 根实体
   */
  private ParseEntity root;
  /**
   * 是否在标签中
   */
  private boolean inTag;
  /**
   * 标签信息
   */
  private StringBuilder tag;

  public Parse() {
    parseObList = new LinkedList<>();
    parseObList.add(new LeftAngleBracketParseOb(this));
    parseObList.add(new RightAngleBracketParseOb(this));
    parseObList.add(new OtherParseOb(this));
    root = new ParseEntity(null);
    cur = root;
  }

  public int getLine() {
    return line;
  }

  public String loadLineString() {
    return load.toString();
  }

  public boolean isInTag() {
    return inTag == true;
  }

  /**
   * 进入tag标签
   */
  public void toInTag() {
    this.inTag = true;
  }

  /**
   * 退出tag标签
   */
  public void toOutTag(){
    this.inTag = false;
  }

  public void resetTag(){
    this.tag = new StringBuilder();
  }

  public void appendTag(char c){
    tag.append(c);
  }

  public StringBuilder getTag() {
    return tag;
  }

  public void endEntity(){
    this.cur = this.cur.parent();
  }


  public String getCurTagName(){
    return cur.getName();
  }

  /**
   * 增加一个子节点，让当前节点移动到子节点
   */
  public void addChildrenEntity(){
    List<ParseEntity> chirdren = cur.getChirdren();
    if(null == chirdren){
      chirdren = new LinkedList<>();
      cur.setChirdren(chirdren);
    }
    ParseEntity parseEntity = new ParseEntity(cur);
    parseEntity.setName(this.getTag().toString());
    chirdren.add(parseEntity);
    this.cur = parseEntity;
  }

  public void readLine(String str){
    line++;
    load = new StringBuilder();
    if(null == str){
      return;
    }
    if(str.length() == 0){
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      readChar(str.charAt(i));
    }
  }

  public void readChar(char c){
    load.append(c);
    for (IParseOb parseOb: parseObList){
      parseOb.excue(c);
    }
  }

  /**
   * 输出读取实体
   * 读取完成后没有回到root节点，说明读取数据缺失
   * @return
   */
  public List<ParseEntity> parseEntity(){
    if(this.root != this.cur){
      throw new RuntimeException("内容不完整");
    }
    return this.root.getChirdren();
  }
}

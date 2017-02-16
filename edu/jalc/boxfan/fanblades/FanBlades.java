package edu.jalc.boxfan;

class FanBlades{
  private int length;
  private int height;

  private FanBlades(){}

  public int setFanBladeLength(int length){
    return this.length = length;
  }
  public int setFanbladeHeight(int height){
    return this.height = height;
  }
  public int getFanBladeLength(){return this.length;}
  public int getFanBladeHeight(){return this.height;}
}

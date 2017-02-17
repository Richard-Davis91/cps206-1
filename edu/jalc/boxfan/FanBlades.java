package edu.jalc.boxfan;

class FanBlades{
  private int length;

  private FanBlades(){this.length = 0;}

  public int setFanBladeLength(int length){return this.length = length;}

  public int getFanBladeLength(){return this.length;}
}

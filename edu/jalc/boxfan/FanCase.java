package edu.jalc.boxfan;
import edu.jalc.boxfan.FanBlades;

class FanCase{

  private int height;
  private int length;
  private int width;
  FanBlades fanBlades;

  private FanCase(){
    this.height = 0;
    this.length = this.height;
    this.width = 0;
    fanBlades.setFanBladeLength(this.height - 1);
  }

  public int getFanCaseHeight(){return this.height;}
  public int getFanCaseLength(){return this.length;}
  public int getFanCaseWidth(){return this.width;}

  public void setFanCaseHeight(int height){
    this.height = fanBlades.setFanBladeLength(this.height - 1);
    this.length = this.height;

  }
  public void setFanCaseWidth(int width){
    this.width = width;
  }
}

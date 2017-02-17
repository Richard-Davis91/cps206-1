package edu.jalc.boxfan;
import edu.jalc.boxfan.PowerCord;


class ControlSwitch{
  private ControlSwitch controlSwitch;
  private PowerCord powerCord;
  private int fanPowerSetting;

  private ControlSwitch(){this.fanPowerSetting = 0;}

  public void getFanPower(){
    switch (this.fanPowerSetting){
      case 0: System.out.println("Fan is off");
              break;
      case 1: System.out.println("Fan is on Low");
              break;
      case 2: System.out.println("Fan is on Med");
              break;
      case 3: System.out.println("Fan is on High");
              break;
    }
  }
  public int setFanPower(int fanPowerSetting)throws Exception{
    try{
      if(fanPowerSetting>3 || fanPowerSetting<0){
      System.out.println("Fan settings only go from 0-3");
      return this.fanPowerSetting = 0;
      }
      return this.fanPowerSetting = fanPowerSetting;
    }catch(Exception e){
      return this.fanPowerSetting = 0;
    }
  }
}

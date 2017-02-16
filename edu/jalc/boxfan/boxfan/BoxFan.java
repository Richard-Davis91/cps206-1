package edu.jalc.boxfan;
import edu.jalc.boxfan.fancase.FanCase;
import edu.jalc.boxfan.fanblades.FanBlades;
import edu.jalc.boxfan.motor.Motor;

class BoxFan{
  private BoxFan boxFan;
  private FanCase fanCase;
  private Motor motor;
  private ControlSwitch controlSwitch;
  private FanBlades fanBlades;

  private BoxFan boxFan(){return this.boxFan;}
}

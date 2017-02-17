package edu.jalc.boxfan;

class PowerCord{
  boolean pluggedIn;

  private PowerCord(){pluggedIn = true;}

  public boolean isPluggedIn(){return this.pluggedIn;}
  
  public boolean plugIn(){return pluggedIn = true;}
  public boolean unPlug(){return pluggedIn = false;}

}

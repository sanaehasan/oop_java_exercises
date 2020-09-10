package com.techreturners.cats;

public interface Cat {


  boolean sleep=false;
  String eat;
  boolean run=false;
  double  height;
  String  sound;
  String  catSetting;

  //cat's sleep status 
public void goToSleep();
public void wakeUp();
public boolean isAsleep();

//return is cat eating / running 
public String eat();
public boolean run();

// get cat's type and heighth
public String getSetting();
public boolean getHeight();


}

package com.techreturners.cats;

import sun.reflect.generics.tree.Wildcard;

public class LionCat extends WildCat{


 //cat's sleep status 
 public void goToSleep(){};
 public void wakeUp(){};
 public boolean isAsleep(){ return false;};
 
 //return is cat eating / running 
 public String eat(){ return "";};
 public boolean run(){return false;};
 
 // get cat's type and height
 public String getSetting(){ return "";};
 public int getAverageHeight(){ return 0;};
 
}
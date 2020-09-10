package com.techreturners.cats;

public class DomesticCat implements Cat{

    boolean sleep;
    String eat;
    boolean run;
    double  height;
    String  sound;
    String  catSetting;

public void goToSleep(){
    Cat.sleep=true;
}
public void wakeUp(){
    Cat.sleep=false;
}
public boolean isAsleep(){
    return cat.sleep;
}

public boolean eat();
public boolean run();

public String getSetting();
public boolean getHeight();


}
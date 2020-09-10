package com.techreturners.cats;
import Cat;
public class DomesticCat implements Cat{

    boolean sleep=false;
    String eat;
    boolean run=false;
    int  height=23;
    String  catSetting="domestic";

public void goToSleep(){
    this.sleep=true;
}
public void wakeUp(){
    this.sleep=false;
}
public boolean isAsleep(){
    return this.sleep;
}

public String eat(){
    return this.eat="Purrrrrrr";
};

//in case the cas is full the sound should be diffirent
public String isFull(){
    return this.eat="miow";
}
public boolean run(){
  return this.run=true;
}

public String getSetting(){
    return this.catSetting;
}
public int getHeight(){
 return this.height;
}
//in case the cat is bit bigger or smaller than avarage 
public void setHeight(int height){
this.height = height;
}

//get avarage height of a dometic cat
public int getAverageHeight(){
 return 23;
}

}
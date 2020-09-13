package com.techreturners.cats;

import sun.net.www.content.text.plain;

public  class WildCat implements Cat {

  private boolean sleep;
  private String eat;
  private boolean run;
  private int  height;
  private String  catSetting;
  
  public WildCat( boolean sleep,String eat,boolean run,int  height,String  catSetting){

    this.sleep=sleep;
    this.eat=eat;
    this.run=run;
    this.height=height;
    this.catSetting=catSetting;
}
    
//cat sleep status 
public void goToSleep(){ this.sleep=true; this.run=false;};

public void wakeUp(){  this.sleep=false; };

public boolean isAsleep(){ return this.sleep;};

//return is cat eating / running 
public String eat(){ return this.eat;}

public boolean run(){return this.run=true;};

// get cat's type and height
public String getSetting(){ return this.catSetting;};

public int getAverageHeight(){ return this.height;};

//Set eat and height for domestic cat 

public void SetEat(String eat){
   this.eat=eat;
}


public void Setheight(int height){
  this.height = height;
}

}

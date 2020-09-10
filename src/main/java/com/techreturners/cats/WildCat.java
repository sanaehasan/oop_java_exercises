package com.techreturners.cats;

public class WildCat  implements Cat{
    boolean sleep;
    String eat;
    boolean run;
    int  height;
    String  catSetting;

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
 
}
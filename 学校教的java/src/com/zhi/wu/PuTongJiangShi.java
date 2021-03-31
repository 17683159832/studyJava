package com.zhi.wu;

public class PuTongJiangShi {
     String kind;
     int blood;
     int lostBlood;

    public void blood_lost(){
        if(blood <=0 ){
            die();
        }
        blood-=lostBlood;
    }
    public void die(){

        System.out.println("死亡");
    }


    public PuTongJiangShi() {
    }

    public PuTongJiangShi(String kind, int blood) {
        this.kind = kind;
        this.blood = blood;
    }

}

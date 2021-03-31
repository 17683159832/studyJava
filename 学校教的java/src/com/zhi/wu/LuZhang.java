package com.zhi.wu;

public class LuZhang extends DaoJu{

    public LuZhang(int blood, int lostBlood) {
        this.blood = blood;
        this.lostBlood = lostBlood;
    }

    @Override
    public void blood_lost() {
        if(blood <= 0){
            destory();
        }
        blood-=lostBlood;
    }

    @Override
    public void destory() {
        System.out.println("道具销毁");
    }
}

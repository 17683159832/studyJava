package com.zhi.wu;

public class TieTongJiangShi {
    String kind;
    int blood;
    int lostBlood;
    DaoJu daoJu;

    public void blood_lost(){
        if (daoJu.blood <= 0) {
            if (blood <= 0) {
                die();
            }
            blood -= lostBlood;
        }else {
            daoJu.blood_lost();
        }
    }
    public void die(){
        System.out.println("死亡");
    }

    public TieTongJiangShi() {
    }

    public TieTongJiangShi(String kind, int blood) {
        this.kind = kind;
        this.blood = blood;
    }
}

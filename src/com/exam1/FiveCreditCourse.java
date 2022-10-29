package com.exam1;

public class FiveCreditCourse extends Course {
    private int credit;

    public FiveCreditCourse(){
        super();
    }

    public FiveCreditCourse(String name) {
        super(name);
        setDuration(1);
        setTuitionFee(6000);
        this.credit=5;
    }


    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

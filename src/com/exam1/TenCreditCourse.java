package com.exam1;

public class TenCreditCourse extends Course{
    private int credit;

    public TenCreditCourse(String name) {
        super(name);
        setDuration(1);
        setTuitionFee(12000);
        this.credit=10;
    }


    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

package com.exam1;

public class Course {

    private int duration;
    private int tuitionFee;
    static private int totalFee;
    public String name;

    public  Course(){
        this.duration = 1;
        this.tuitionFee=12000;
    }

    public  Course(String name){
        this.name = name;
    }
        public int duration(){
            return duration;
        };
        public int tuitionFee(){
            return tuitionFee;
        }
        public static int totalTuitionFee(Course[] courses){
            totalFee = 0;
            for(int x = 0; x<= courses.length -1; x++){
                totalFee = totalFee + courses[x].tuitionFee;
            }
            return totalFee;
        }

        public void setTuitionFee(int tuitionFee){
            this.tuitionFee=tuitionFee;
        }

        public void setDuration(int duration){
            this.duration = duration;
        }
}

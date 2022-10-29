import com.exam1.Course;
import com.exam1.FiveCreditCourse;
import com.exam1.TenCreditCourse;

public class Main {
    public static void main(String[] args) {

        Course courses[] = new Course[3];

//        Course course = new Course("course1", 1, 6000);
          FiveCreditCourse fcCourse = new FiveCreditCourse("5credit 1");
        TenCreditCourse tenCreditCourse = new TenCreditCourse( "10 credit course ");
        FiveCreditCourse f2 = new FiveCreditCourse();
        f2.name = "abc" ;
        f2.setCredit(5);
        f2.setDuration(2);
        f2.setTuitionFee(5000);


        courses[0] = fcCourse;
        courses[1] = tenCreditCourse;
        courses[2] = f2;
        Course c = new Course("abc");

        c.totalTuitionFee(courses);

//        System.out.println("course " + course.name + "d " + course.duration() + " f " + course.tuitionFee());
        System.out.println("course 5: " + fcCourse.name + "d: " + fcCourse.duration() + " f: " + fcCourse.tuitionFee() + " '" + fcCourse.getCredit());
        System.out.println("course 10:" + tenCreditCourse.name +  "d:" + tenCreditCourse.duration() + " f " + tenCreditCourse.tuitionFee() + " c" + tenCreditCourse.getCredit());
        System.out.println("total fee" + Course.totalTuitionFee(courses));
        System.out.println("c 1" + c.totalTuitionFee(courses));

        for(int x=0; x<= courses.length -1; x++){
            System.out.println("name " + courses[x].name);
        }

    }
}
package xuexiao;

public class keCheng {
    void keChengMingCheng(int z){
        if(z == 5){
            System.out.println("线性代数");
        }else if(z == 6){
            System.out.println("大学物理");
        }else if(z == 0){
            System.out.println("无");
        }
    }
    void keChengXinXi(int q){
        if(q == 5){
            System.out.println("课程编号:5，课程名称:线性代数，200教室，上课时间:11:05，授课教师:张三");
        }else if(q == 6){
            System.out.println("课程编号:6，课程名称:大学物理，300教室，上课时间:15:30，授课教师:李四");
        }
    }
}

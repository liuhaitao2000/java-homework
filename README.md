# java-homework
实验目的：
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法。掌握面向对象的类设计方法，掌握类的继承用法，通过构造方法实例化对象。学会使用super（），用于实例化子类。掌握object根类的to string方法，应用在相关对象的信息输出中。
实验过程：
刚看到题目要求，没有任何思路，通过上网利用CSDN论坛中的现成代码为基础，再根据老师的具体需求进行修改并在舍友的帮助下完成。将人员作为父类，教师、学生为子类，课程为公共类，新增加系统当主类。人员输入学生和教师的编号，姓名，性别，年龄（新增） 学生继承人员的函数和方法，增加了选课的中文提示；教师继承人员的函数和方法，加入判断语句进行教师教授课程区分。大量使用了判断语句和循环语句，例如通过输入相应代码系统判断该学生是否选了该课程以及输入的代码代表了哪个学生。
核心代码：
package xuexiao;

import java.util.Scanner;

public class xiTong {
    public static void main(String args[]){
        System.out.println("学生号码：1、2");
        System.out.println("教师号码：3、4");
        System.out.println("课程号码：5、6");
        jiaoShi jS = new jiaoShi();
        xueSheng xS = new xueSheng();
        keCheng kC = new keCheng();
        int keCheng1 = 0;
        int keCheng2 = 0;
        for(int a=0;a<2;a++){
            System.out.println("输入编号查询学生/教师/课程相关信息，输入后回车确认");
            System.out.println("学生选课/退课请直接输入0后回车确认");
            System.out.println("不可退出 查询后可退出");
            Scanner chaxun = new Scanner(System.in);
            int bianhao = chaxun.nextInt();
            if(bianhao == 1){
                xS.bianHao(1);
                xS.suoXuanKeCheng();
                kC.keChengMingCheng(keCheng1);
            }else if(bianhao == 2) {
                xS.bianHao(2);
                xS.suoXuanKeCheng();
                kC.keChengMingCheng(keCheng2);
            }else if(bianhao == 3){
                jS.bianHao(3);
                jS.suoShouKeCheng(3);
            }else if(bianhao == 4){
                jS.bianHao(4);
                jS.suoShouKeCheng(4);
            }else if(bianhao == 5){
                kC.keChengXinXi(5);
            }else if(bianhao == 6){
                kC.keChengXinXi(6);
            }
            else if(bianhao == 0){           //选课系统
                System.out.println("请输入选课/退课学生编号");
                Scanner xueShengXuanTui = new Scanner(System.in);
                int xSBH = xueShengXuanTui.nextInt();
                if(xSBH == 1){
                    retry:
                    for(int b=0;b<2;b++){
                        if(keCheng1 == 0){
                            System.out.println("请输入课程编号后回车选择课程");
                            System.out.println("线性代数:5");
                            System.out.println("大学物理:6");
                            Scanner xuanKe = new Scanner(System.in);
                            int xuanke = xuanKe.nextInt();
                            if(xuanke == 5){
                                keCheng2 = 5;
                            }else if(xuanke == 6){
                                keCheng1 = 6;
                            }else {
                                System.out.println("输入正确课程编号");
                                b = 0;
                                break retry;
                            }
                        }else if (keCheng1 == 5 ||keCheng1 == 6){
                            System.out.println("输入1后回车退课");
                            System.out.println("输入0后回车退出选课系统");
                            Scanner tuiKe = new Scanner(System.in);
                            int tuike = tuiKe.nextInt();
                            if(tuike == 1){
                                keCheng1 = 0;
                                b = 2;
                            }else if(tuike ==0){
                                break;
                            }else{
                                System.out.println("请重新进行选择课程");
                                b = 0;
                                break retry;
                            }
                        }
                    }
                }else if(xSBH == 2){
                    retry:
                    for(int b=0;b<2;b++){
                        if(keCheng2 == 0){
                            System.out.println("请输入课程编号后回车选择课程");
                            System.out.println("线性代数:5");
                            System.out.println("大学物理:6");
                            Scanner xuanKe = new Scanner(System.in);
                            int xuanke = xuanKe.nextInt();
                            if(xuanke == 5){
                                keCheng2 = 5;
                            }else if(xuanke == 6){
                                keCheng2 = 6;
                            }else {
                                System.out.println("请输入正确课程编号");
                                b=0;
                                break retry;
                            }
                        }else if (keCheng2 == 5 ||keCheng2 == 6){
                            System.out.println("输入1后回车退课");
                            System.out.println("输入0后回车退出选课系统");
                            Scanner tuiKe = new Scanner(System.in);
                            int tuike = tuiKe.nextInt();
                            if(tuike == 1){
                                keCheng2 = 0;
                                b = 2;
                            }else if(tuike == 0){
                                break;
                            }else{
                                System.out.println("请重新进行选择课程");
                                b = 0;
                                break retry;
                            }
                        }
                    }
                }
            }
            System.out.println("想再次查询请输入1，退出请输入0");
            Scanner tuichu = new Scanner(System.in);
            int xuanze = tuichu.nextInt();
            if(xuanze == 1){
                a = 0;
            }else if(xuanze == 0){
                a = 2;
            }
        }
    }
}
实验结果：
学生号码：1、2
教师号码：3、4
课程号码：5、6
输入编号查询学生/教师/课程相关信息，输入后回车确认
学生选课/退课请直接输入0后回车确认
不可退出 查询后可退出
1
编号:1，小明，男，18岁，所选课程:无
想再次查询请输入1，退出请输入0
实验感想：
本次实验大部分代码还是通过网络复制过来的，在舍友的帮助下，基本读懂了代码。但是自己仍旧没有独立编码的能力。与老师的要求有差距。在课下的课余时间我会复习老师已经见过的知识，认真阅读老师布置的重点章节，这个代码没有完全完成老师需求 没有使用super语句，因为课上没有听懂在课下还没有自己学明白。代码中使用的循环与判断逻辑还是停留在c语言的阶段。

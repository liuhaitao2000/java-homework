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

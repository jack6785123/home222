

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student[] = {new Student("lin1","male","資訊工程系",15,28,80),
                new Student("lin2","Female","資訊工程學系",50,50,70),
                new Student("lin3","male","資訊工程學系",10,90,60),
                new Student("lin4","Female","資訊工程學系",1,20,30),
                new Student("lin5","male","資訊工程學系",100,25,50)};
        while (true){
            System.out.println("功能列表:");
            System.out.println("1.查某位同學資料");
            System.out.println("2.查全部同學資料");
            System.out.println("3.查某一科目平均");
            System.out.println("4.查某位同學總分");
            System.out.println("5.結束");
            int fun = sc.nextInt();
            if ( fun == 1){
                System.out.print("你要查第幾位同學?");
                int num = sc.nextInt();
                if (num > student.length){
                    System.out.println("沒這麼多學生");
                }else {
                    System.out.println("姓名: " + student[num - 1].getName());
                    System.out.println("性別: " + student[num - 1].getSex());
                    System.out.println("系別: " + student[num - 1].get系別());
                    System.out.println("國文: " + student[num - 1].getChinese());
                    System.out.println("英文: " + student[num - 1].getEnglish());
                    System.out.println("數學: " + student[num - 1].getMath());
                }
            }else if (fun == 2){
                for (int j = 0; j < student.length ;j++ ){
                    System.out.println("姓名: " + student[j].getName());
                    System.out.println("性別: " + student[j].getSex());
                    System.out.println("系別: " + student[j].get系別());
                    System.out.println("國文: " + student[j].getChinese());
                    System.out.println("英文: " + student[j].getEnglish());
                    System.out.println("數學: " + student[j].getMath());
                    System.out.println("==========================");

                }
            }else if (fun == 3){
                System.out.println("你要查哪一科?");
                System.out.println("1.國文");
                System.out.println("2.英文");
                System.out.println("3.數學");
                System.out.println("其他鍵返回");
                int num = sc.nextInt();
                int sum = 0;
                if (num == 1){
                    for (int i = 0;i < student.length;i++){
                        sum+=student[i].chinese;
                    }
                    System.out.println("國文平均:" + sum/student.length);
                }else if (num == 2){
                    for (int i = 0;i < student.length;i++){
                        sum+=student[i].english;
                    }
                    System.out.println("英文平均:" + sum/student.length);
                }else if (num == 3){
                    for (int i = 0;i < student.length;i++){
                        sum+=student[i].math;
                    }
                    System.out.println("數學平均:" + sum/student.length);
                }
            }else if (fun == 4){
                System.out.print("你要查第幾位同學的總分和平均?");
                int num = sc.nextInt();
                if (num > student.length){
                    System.out.println("沒這麼多學生");
                }else {
                    System.out.println("總分:" + student[num].getTotal());
                    System.out.println("平均:" + student[num].getAverage());
                }
            }else if (fun == 5){
                break;
            }
        }

    }
}

class Student{
    String name,sex,系別;
    int english,chinese,math;
    Student(String name,String sex,String 系別,int english,int chinese,int math){
        this.name = name;
        this.sex = sex;
        this.系別 = 系別;
        this.english = english;
        this.chinese = chinese;
        this.math = math;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {

        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {

        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public String get系別() {

        return 系別;
    }

    public void set系別(String 系別) {
        this.系別 = 系別;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal(){
        return chinese + english + math;
    }

    public int getAverage(){
        return getTotal() / 3;
    }
}

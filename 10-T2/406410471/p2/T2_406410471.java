package p2;

public class T2_406410471 {

	public static void main(String[] args) {
        Birthday birthday1 = new Birthday("J123456789");
        Birthday birthday2= new Birthday("A212121222",2012,5,24,15,30,20);
        Birthday birthday3= new Birthday("D239090989",2012,3,29,23,1,40);
        birthday1.setYear(2000);
        birthday1.setMonth(5);
        birthday1.setDay(3);
        birthday1.setHour(10);
        birthday1.setMinute(20);
        birthday1.setSecond(30);   
        System.out.println("Birthday1: "+ birthday1);
        System.out.println("Birthday2: "+ birthday2);
        System.out.println("Birthday3: "+ birthday3);
    }

}

/*
2.	(25%) 將第一題的Birthday內的資料放在三個class  Date，Time，Birthday中。其中 
(a). Date 包含了 year, month, day;
(b)  Time 繼承了Date，可以存取year, month, day, hour, minute, second; and
(c)  Birthday 繼承 Time， 可以存取userID，year, month, day, hour, minute, second。
請根據第一題的測試程式，要能得到所要的輸出。三個class有關之變數的 setters and getters必須完整建立。

Filename: T2_ID.java, Date.java, Time.java, Birthday.java，置於package t2中
Grading: 三個class變數及建構子 15%，setters and getters 5%, toString() 5%
*/
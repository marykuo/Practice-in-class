package p1;

public class T1_406410471 {

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


/* output ¡V ­n¹ï»ô
Birthday1: J123456789, 2000/05/03 10:20:30 
Birthday2: A212121222, 2012/05/24 15:30:20
Birthday3: D239090989, 2012/03/29 23:01:40
*/

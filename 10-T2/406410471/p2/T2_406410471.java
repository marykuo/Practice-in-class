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
2.	(25%) �N�Ĥ@�D��Birthday������Ʃ�b�T��class  Date�ATime�ABirthday���C�䤤 
(a). Date �]�t�F year, month, day;
(b)  Time �~�ӤFDate�A�i�H�s��year, month, day, hour, minute, second; and
(c)  Birthday �~�� Time�A �i�H�s��userID�Ayear, month, day, hour, minute, second�C
�ЮھڲĤ@�D�����յ{���A�n��o��ҭn����X�C�T��class�������ܼƪ� setters and getters��������إߡC

Filename: T2_ID.java, Date.java, Time.java, Birthday.java�A�m��package t2��
Grading: �T��class�ܼƤΫغc�l 15%�Asetters and getters 5%, toString() 5%
*/
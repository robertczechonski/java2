public class Napisy {
    public static void main(String[] args) {
        String napis = "";
        String powitanie = " Cześć!";
        String powitanie2 = " cześć!";
        String s = powitanie.substring(0,3);
        String message = "Orange";
        int year = 2023;
        int mon = 3;
        String all = String.join(" ",powitanie,message);
        String rep = "java ".repeat(5);
        String replace = "Cześć Orange".replace("Orange","Plus");

//        System.out.println(s.length());
//        System.out.println(powitanie + " " + message);
//        System.out.println(powitanie + "" + message  + year + mon);
//        System.out.println(powitanie + "" + message  + (year + mon));
//        System.out.println(year + mon + powitanie + " " + message);
//        System.out.println(year + mon + powitanie + " " + message);
//        System.out.println(all);
//        System.out.println(rep);
        System.out.println(powitanie.equals(powitanie2));
        System.out.println(powitanie.equalsIgnoreCase(powitanie2));
        System.out.println(powitanie.charAt(1));
        System.out.println(replace);
        System.out.printf("Mamy rok %d i miesiąć %d",year,mon);

    }
}

public class instrukcje {
    public static void main(String[] args) {
        int sales = 10010;
        int target = 10000;
        String perform = "";
        int bonus = 0;

        if (sales > target){
            perform = "dobrze";
            bonus = 150;
        } else if (sales == target) {
            perform = "srednio";
            bonus = 100;
        } else {
            perform = "slabo";
            bonus = -100;
        }

        System.out.println(bonus);

//        if (sales > target) bonus = 123; else bonus = -100;


    }
}

package Head_First_Java;

public class BottleSong {
    
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
            
            if (bottlesNum == 1) {
                word = "bottle";
            }

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall ");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall ");
            System.out.println("And if one bottle should accidentally fall");
            bottlesNum--;

            if (bottlesNum > 0) {
                if (bottlesNum == 1) {
                    word = "bottle";
                    System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
                } else {
                    System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
                }
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}

package Head_First_Java;

class EchoTestDrive {
    public static void main(String[] args) {
        Echo el = new Echo();
        Echo e2 = new Echo();

        int x = 0;
        while (x < 4) {
            el.hello();
    
            if (x < 5) {
                e2.count = e2.count + 1;
            }
            if (x < 5) {
                e2.count = e2.count + 1;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
    
}



class Echo {
    int count = 0;

    void hello() {
        System.out.println("helloooo... ");
    }
}

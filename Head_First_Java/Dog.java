package Head_First_Java;

class Dog {
    int size;
    String bread;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.size = 40);
        d.bark();
    }
}
public class first_program {
    public static void main(String[] args) {
        try {
            System.out.println("Learning java");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
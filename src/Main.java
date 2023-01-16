public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bodyMaxIndex = service.calculate(45, 155);

        System.out.println(bodyMaxIndex);
    }
}
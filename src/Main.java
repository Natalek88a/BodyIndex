public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 73; //масса в кг
        int height = 175; //рост в см

        float bodyMassIndex = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен " + bodyMassIndex);
    }
}
public class Main {
    public static void main(String[] args) {
        String bulletIt = "Pring a Bulleted Lust: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bullet List:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 20;
        System.out.printf("Your age is %d%n",age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %f%n", age,(float)yearOfBirth);




    }
}
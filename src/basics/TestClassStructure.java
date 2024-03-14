package basics;

public class TestClassStructure {

    public static void main(String[] args) {
        // blocul static se ruleaza doar o data, desi se creaza 2 obiecte , doar cel nestatic se creaza de fiecare data

        ClassStructure firstClassStructure = new ClassStructure();// executa blocul nestatic din clasa ClassStructure, deci creste a-ul
        System.out.println("a = " + firstClassStructure.getA());
        System.out.println("counter = " + ClassStructure.getCounter());

        ClassStructure secondClassStructure = new ClassStructure(); // executa dinou blocul nestatic -> creste dinou a-ul, il creste de la 0, a nu e static
        System.out.println("a = " + secondClassStructure.getA());
        System.out.println("counter = " + ClassStructure.getCounter());
    }
}
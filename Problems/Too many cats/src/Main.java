class Cat {

    // write static and instance variables
    static int counter;
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        // implement the constructor
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}
package base.animal.data;

public class Animal implements Comparable<Animal> {
    private int id;
    private String name;
    private String type;
    private String description;
    private int age;
    private boolean star;
    private boolean winner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return
                id +
                " | name: " + name +
                " | type: " + type +
                " | description: " + description +
                " | age: " + age +
                " | star: " + star +
                " | winner: " + winner;
    }

    public Animal() {

    }

    public Animal(Animal animal) {
        this.id = animal.id;
        this.name = animal.name;
        this.type = animal.type;
        this.description = animal.description;
        this.age = animal.age;
        this.star = animal.star;
        this.winner = animal.winner;
    }



    public Animal(String name, String type, String description, int age) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.age = age;
    }

    public Animal(String animalString, int age) {
        //Splits the animalString.
        String[] animalStringArray = animalString.split(" ");

        //Sets the fields.
        this.name = animalStringArray[0];
        this.description = animalStringArray[2];
        this.type = animalStringArray[3];
        this.age = age;
    }

    public Animal(String animalString, int age, boolean star, boolean winner) {
        //Splits the animalString.
        String[] animalStringArray = animalString.split(" ");

        //Sets the fields.
        this.name = animalStringArray[0];
        this.description = animalStringArray[2];
        this.type = animalStringArray[3];
        this.age = age;
        this.winner = winner;
        this.star = star;
    }


    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }


}

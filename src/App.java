class Frog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }
}



/**
 * Created by LordwolF on 8/3/2016.
 */
public class App {
    public static void main(String[] args) {

        Frog frog1 = new Frog();

        //frog1.name = "Kermit";
        //frog1.age = 1;

        frog1.setName("Kermit");


        System.out.println(frog1.getName());
    }
}

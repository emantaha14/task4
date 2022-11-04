package task4;

public class Data extends PrintClass {
    int id;
    String name;
    static int count = 1;

    @Override
    public void print(String name) {
        System.out.println(name);
        this.id = count ;
        count++ ;
    }

    Data(final int id , String name ) {
        this.id = id ;
        this.name = name ;
    }
    Data(){}
}

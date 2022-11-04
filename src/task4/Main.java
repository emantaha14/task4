package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
        Data obj1 = new Data();
//        obj1.print(name);
        ArrayList addIdList = new ArrayList();
        ArrayList<String> addNewName = new ArrayList();
        String newName = " ";
        int newId = 0;
        while (true) {
            obj1.printLn();
            int chooseNumber = sc.nextInt();
            if (chooseNumber == 1) {
                newId = sc.nextInt();
                newName = sc.next();
                addIdList.add(newId);
                addNewName.add(newName);
                if (newId == -1) {
                    obj1.print(newName);
                    System.out.println(obj1.id + " " + newName);
                    addIdList.add(obj1.id);
                } else {
                    System.out.println(newId + " " + newName);
                    System.out.println("the name is added");
                }

            } else if (chooseNumber == 2) {
                System.out.println("enter id");
                int existId = sc.nextInt();
                if (!(addIdList.contains(existId))) {
                    System.out.println("id doesn't exist");
                } else if (addIdList.contains(existId)) {
                    System.out.println(existId);
                    System.out.println(newName);
                }
            }

        }
    }
}

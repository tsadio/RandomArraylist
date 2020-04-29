/**
 * Program to randomly generate a sentence using subjects,
 * verbs and objects store in ArrayLists
 * First, initialise three ArrayLists of, 4 subjects
 * 5 verbs and 9 objects.
 * Next, use a for loop to prompt the user to enter subjects
 * verbs and objects in each ArrayLists.
 * Next, ask the user if he want to create a sentence
 * If the answer is yes, choose the subject, the verb and the
 * object by using one random integer for each ArrayList
 * Finally, display the sentence.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class RandomArraylist {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int sub, ver, ob;

        ArrayList<String> subject = new ArrayList<String>();
        ArrayList<String> verb = new ArrayList<String>();
        ArrayList<String> object = new ArrayList<String>();
        String response;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter your " + i + " subject: ");
            subject.add(in.nextLine());
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your " + i + " verb: ");
            verb.add(in.nextLine());
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println("Enter your " + i + " object: ");
            object.add(in.nextLine());
        }

        System.out.println("Do you want to generate a sentence: ");
        response = in.nextLine();

        if (response.equals("yes") || response.equals("y")) {
            sub = 0 + ran.nextInt(5);
            ver = 0 + ran.nextInt(6);
            ob = 0 + ran.nextInt(10);
            System.out.println(subject.get(sub) + " " + verb.get(ver) + " " + object.get(ob));

        }

    }

}

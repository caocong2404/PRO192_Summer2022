package SubStringandPool;

import data.*;
import java.util.*;

public class SubStringandPool {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int n;
        System.out.print("Input choice: ");
        n = Integer.parseInt(sc.nextLine());
        int check = 0;
        while (check < n) {
            check++;
            System.out.print("No." + check + ": ");
            String s = sc.nextLine();
            list.add(s);
        }
        List<String> firstName = new ArrayList<>();
        String surName[] = new String[n];

        for (int i = 0; i < list.size(); i++) {
            String cutName[] = list.get(i).split("\\s+");
            if (cutName.length == 3) {
                surName[i] = (cutName[1].trim());
            }

        }

        List<String> lastName = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String arr[] = list.get(i).split(" ");
            if (arr.length == 3) {
                firstName.add(arr[2].trim());
                lastName.add(arr[0].trim());
            } else {
                firstName.add(arr[1].trim());
                lastName.add(arr[1].trim());
            }
        }
        String tmp = "";
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if (firstName.get(i).compareToIgnoreCase(firstName.get(j)) > 1) {
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);

                } else if (firstName.get(i).compareToIgnoreCase(firstName.get(j)) == 0) {
                    if (list.get(i).length() == 3 && list.get(j).length() == 3) {
                        if (surName[i].compareToIgnoreCase(surName[j]) > 1) {
                            tmp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, tmp);
                        } else {
                            if (lastName.get(i).compareToIgnoreCase(lastName.get(j)) > 1) {

                                tmp = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, tmp);
                            }
                        }
                    } else {
                        if (lastName.get(i).compareToIgnoreCase(lastName.get(j)) > 1) {

                            tmp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, tmp);
                        }
                    }

                }
            }
        }
        for (String x : list) {
            System.out.println(x);
        }

    }

    public void amethod(String a, int b) {
    }

    public void amethod(int b, String a) {
    }

}

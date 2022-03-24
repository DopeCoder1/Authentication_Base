package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Registration> db = new ArrayList<>();

        while (true){
            System.out.println("press 1 for registration");
            System.out.println("press 2 for login");
            int menu = in.nextInt();
            if( menu ==1 ){
                Registration r = new Registration();
                    System.out.println("Enter ur name: ");
                    String name = in.next();
                    System.out.println("Enter ur surname: ");
                    String surname = in.next();
                    System.out.println("Enter ur email: ");
                    String email = in.next();
                    System.out.println("Enter ur password: ");
                    String password = in.next();
                    if(name.length()<=20 && surname.length()<=20 && password.length()>=8)
                    {
                        r.setName(name);
                        r.setSurname(surname);
                        r.setPassword(password);
                        r.setEmail(email);
                        db.add(r);
                    }
                    else{
                        System.out.println("Error");
                    }
            }
            else if( menu == 2 ){
                int sum = 0;
                System.out.println("Login Menu: ");
                System.out.println("Enter ur email: ");
                String email = in.next();
                System.out.println("Enter ur password: ");
                String password = in.next();

                if(sum == 3)
                {
                    System.out.println("End...");
                    break;
                }

                for(int j=0;j<db.size();j++)
                {

                    if(db.get(j).getEmail().equals(email) && db.get(j).getPassword().equals(password))
                    {
                        System.out.println("Press [1] for change password: ");
                        System.out.println("Press [2] for change email: ");
                        System.out.println("Press [3] for change name: ");
                        System.out.println("Press [4] for change surname: ");
                        System.out.println("Press [5] for get info");
                        System.out.println("Press [0] for exit");

                        int menu_change = in.nextInt();
                        if(menu_change == 1 )
                        {
                            System.out.println("Enter new password: ");
                            String new_password = in.next();
                            db.get(j).setPassword(new_password);
                        }
                        else if(menu_change == 2)
                        {
                            System.out.println("Enter new email: ");
                            String new_email = in.next();
                            db.get(j).setEmail(new_email);
                        }
                        else if(menu_change == 3)
                        {
                            System.out.println("Enter new name: ");
                            String new_name = in.next();
                            db.get(j).setName(new_name);
                        }
                        else if(menu_change == 4)
                        {
                            System.out.println("Enter new surname");
                            String new_surname = in.next();
                            db.get(j).setPassword(new_surname);
                        }
                        else if(menu_change == 0)
                        {
                            continue;
                        }
                        else if(menu_change == 5)
                        {
                            System.out.println("Name: "+db.get(j).getName()+" Surname: "+db.get(j).getSurname()+" Email: "+db.get(j).getEmail());
                        }
                    }
                    else{
                        sum++;
                        System.out.println("Please try again!");
                        if(sum == 3)
                        {
                            System.out.println("End...");
                            break;
                        }
                    }

                }

            }
        }
 `   }
}

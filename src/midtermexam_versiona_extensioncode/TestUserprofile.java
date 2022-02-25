/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
U
/**
 *
 * @author Qiong Liao
 */
public class TestUserprofile {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = input.nextLine();
        
        System.out.println("Choose your favourite genre: Comedy, Drama, Action, Mystery");
        String favGenre = input.nextLine();
        
        if(favGenre == "Comedy" || favGenre == "Drama" || favGenre == "Action" || favGenre == "Mystery")
            System.out.println("Your userProfile is created.");
        else
            System.out.println("Please reenter you favourite genre: Comedy, Drama, Action, Mystery");
    }
    
}

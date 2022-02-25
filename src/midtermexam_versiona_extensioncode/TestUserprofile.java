/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

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
        
        System.out.println("Your userProfile is created.");
    }
    
}

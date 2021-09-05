/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
import java.util.Scanner;
public class ServerWOFacade {
	public static void main(String[] args) {
		
    FacadeImplement obj = FacadeImplement.getFacadeObj();
	
	System.out.print("your command (initiate or kill): ");
	Scanner input = new Scanner(System.in);
	String cmdInput = input.nextLine();

	switch (cmdInput) {
		case "initiate":
		obj.initiateServer();
		break;

		case "kill":
		obj.killServer();
		break;

		default:
		System.out.println("Sorry. Your command does not exist.");
	} 
	
	
    }
    
}

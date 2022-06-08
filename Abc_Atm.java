package Assignments;

import java.util.Scanner;

public class Abc_Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0, withdraw, deposit;
		int a=0, b=0, c=0, d = 0;
		int count_a=0;
		byte count_b=0;
		byte count_c=0;
		byte count_d=0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Atm: Automated teller machine");
			System.out.println("choose 1 for deposit");
			System.out.println("choose 2 for withdraw");
			System.out.println("choose 3 for check balance");
			System.out.println("choose 4 for exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the number of 2000 notes  to be deposited");
				a = sc.nextInt();
				System.out.println("enter the number of 500 notes  to be deposited");
				b = sc.nextInt();
				System.out.println("enter the number of 200 notes  to be deposited");
				c = sc.nextInt();
				System.out.println("enter the number of 100 notes  to be deposited");
				d = sc.nextInt();
				if (a < 0 || b < 0 || c < 0 || d < 0) {
					System.out.println("incorrect deposit amount");
				} else if (a == 0 && b == 0 && c == 0 && d == 0) {
					System.out.println("amount deposited camnnot be zero");
				} else {
					deposit = a * 2000 + b * 500 + c * 200 + d * 100;
					balance = balance + deposit;
					System.out.println("money successfully adeed");
					System.out.println(" ");
				}
				break;
			case 2:
				System.out.println("enter the amount to be withdrawn");
				// 10000 ->1000/2000=5->5*2000->1000-1000=0;toh 2000 ke 5 notes but
				// 10700->10000/2000= 5of 2000 700 remaining toh 500 ka one note and 200 ka one!
				withdraw = sc.nextInt();
				if (balance >= withdraw && withdraw % 100 == 0) {
					
					while(withdraw!=0) {
						if(withdraw>=2000 && a>0 && Math.floor(withdraw/2000)>0) {
							withdraw-=2000;
							count_a++;//withdrawl ke wqt
							a--;//total 2000 amount mai minus
						}
						else if(withdraw>=500 && b>0 && Math.floor(withdraw/500)>0) {
							withdraw-=500;
							count_b++;//withdrawl ke wqt
							b--;
							
						}
						else if(withdraw>=200 && c>0 && Math.floor(withdraw/200)>0) {
							withdraw-=200;
							count_c++;//withdrawl ke wqt
							c--;
							
						}
						else if(withdraw>=100 && d>0 && Math.floor(withdraw/100)>0) {
							withdraw-=500;
							count_d++;//withdrawl ke wqt
							d--;
							
						}
						
					}
				}	
					
						
					
					System.out.println("collect your money");
				
				System.out.println("2000:" +count_a);
					System.out.println("500:" + count_b);
					System.out.println("200:" + count_c);
					System.out.println("100:" + count_d);
				 
				    System.out.println("");
				
				   break;
			case 3:
				System.out.println("balance" + balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);

			}

		}

	}
}

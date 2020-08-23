package Acessing;

public class Feature {
        
		String name;
		double bal;
		Feature(String n, double b) {
		name = n;
		bal = b;
		}
		void show() {
		if(bal<0)
		System.out.print("--> ");
		System.out.println(name + ":" + bal);
		}
		}
		class AccountBalance {
		public static void main(String args[]) {
		Feature current[] = new Feature[3];
		
		current[0] = new Feature("sammu", 3000);
		current[1] = new Feature("samhitha", 500);
		current[2] = new Feature("someone", 1000);
		for(int i=0; i<3; i++) current[i].show();
		}
		
	}


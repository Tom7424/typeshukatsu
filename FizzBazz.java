	class FizzBazz {

		  public static void main(String args[]) {
		    for (int i = 1; i <= 100; i++) {
		      String str = "";

		      // ここから記述
		      if((i%3)==0) {
		    	  if((i%5)==0) {
		    		  System.out.println("FizzBuzz");
		    		  continue;
		    	  }System.out.print("Fizz");
		      }
		      else if((i%5)==0) {
		    	  System.out.print("Buzz");
		      }
		      else System.out.print(i);
		      // ここまで記述

		      System.out.println(str);
		    }
		  }
		}



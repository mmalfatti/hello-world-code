package test;

//Your First Program

class HelloWorld {
 public static void main(String[] args) {
     System.out.println("Hello, World!"); 
     
     Integer stpaddr;
     Integer smaddr;
     
     
     stpaddr = 5803;
     
     smaddr = (short) ((stpaddr / 010000) * 04000) + (stpaddr & 03777);
     
     System.out.println("Value of temp = " + smaddr);
     
 }
}
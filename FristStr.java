 import java.util.Scanner;
public class FristStr {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // String Fname=sc.nextLine();
        // System.out.println("Your name is :"+Fname);
          

        
        String fname="Bhanu pratap";
        String lname="Singh tomar";
       // System.out.println(fname+" ".concat(lname));
      // String Fullname=fname+" ".concat(lname); 

       //Concatenation
         String Fullname=fname+" "+lname;                                     
        System.out.println(Fullname);

        //length
       System.out.println(Fullname.length());

      // charAt
    //    char charAt=Fullname.charAt(23 );
    //    System.out.println(charAt);
    for(int i=0; i<Fullname.length(); i++){
        char charAt=Fullname.charAt(i);
        System.out.println(charAt);
       // System.out.println(Fullname.charAt(i));
        
       
    }
       //compare
       if(fname.compareTo(lname)==0){
        System.out.println("String are equal");
       }else{
        System.out.println("String are not equal");
       }
      // System.out.println(fname.compareTo(lname));
    
    
    //subString
    String substring=Fullname.substring(5,10);
    System.out.println(substring);


    //parseint
    String str="12345";
    int number=Integer.parseInt(str);
    System.out.println(number);


   // toString
     int num=12345;
    String strg= Integer.toString(num);
    System.out.println(strg);


    //StringBuilder
    StringBuilder sb=new StringBuilder("bhanu");

    //setchatAt
    sb.setCharAt(0,'R');
    System.out.println(sb);

    //insert
    sb.insert(3,'a');
    System.out.println(sb);

    //delet
      sb.delete(3, 4);
    System.out.println(sb);


    //append
    sb.append(" "+"Singh");
    System.out.println(sb);

    }
}

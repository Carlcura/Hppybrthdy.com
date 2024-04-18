public class Main{
    public static void
    main(String[]args)throws InterruptedException{
        
        String s = "happy birthday jhenilinbombom ^^";
        String message = "may all your wishes come true";
        
        for(int i = 5;i >=0;i--){
            System.out.print("Time Remaining;"+i+"\r");
            Thread.sleep(1000);
        }
        for(int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i));
            Thread.sleep(200);
        }
        
        System.out.println();
        
        for(int i = 0;i< message.length();i++){
            System.out.print(message.charAt(i));
            Thread.sleep(200);
        }
    }
}    
        
        
        


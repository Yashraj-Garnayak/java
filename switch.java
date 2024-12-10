class hello{
    public static void main (String a[]){
        // fist the old switch case
        int opt = 3;
        switch(opt){
            // case 1
            case 1:{
                System.out.println("this is case 1");
                break;
            }
            case 2:{
                System.out.println("this is case 2");
                break;
            }
            case 3:{
                System.out.println("this is case 3");
                break;
            }
            case 4:{
                System.out.println("this is case 4");
                break;
            }
            default :{
                System.out.println("ea tab run hoga jub opt case's ke range mai nehi hoga ");
                break;
            }
        }

        // now lets check kya update hai ki nhi mera java
        // chalo suru karo
        switch(opt){
            case 1-> {
                System.out.println("this is case 1");
            }
            case 2 -> {
                System.out.println("this is case 2");
            }
            case 3 -> {
                System.out.println("this is case 3");
            }
            case 4 -> {
                System.out.println("this is case 4");
            }
            default -> {
                System.out.println("ea tab run hoga jub opt case's ke range mai nehi hoga ");
            }
        }
        // bhai chal gaya mera updated hai apa check karo 



        // ab as an expression chek karte hna 
        String output = "kuch bhi!! ea to change hi hona hai";

        output = switch(opt){
            case 1-> "this is case 1";
            case 2 -> "this is case 2";
            case 3 -> "this is case 3";
            case 4 -> "this is case 4";
            default -> "ea tab run hoga jub opt case's ke range mai nehi hoga ";
        }; // yaad karke ea ";" de dena idhar arna katam kahani 
        // ab print kate hna chalo
        System.out.println(output);

        // chalo bhai ea bhi chal gaya ab ":" ke sath karte han 
        // : ke lia hum yse karenge "yield" 

        String output2 = "kuch bhi!! ea to change hi hona hai";
        output2 = switch(opt){
            case 1: yield "this is case 1";
            case 2: yield "this is case 2";
            case 3: yield "this is case 3";
            case 4: yield "this is case 4";
            default: yield "ea tab run hoga jub opt case's ke range mai nehi hoga ";
        };
         System.out.println(output2);
    }
}
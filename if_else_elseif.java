class if_else{
    public static void main(String a[]){
        byte x = 5;
        byte y = 8;

        // i want to check if brackets is reqired 
        // with brackets
        if (x == 5 || y <= 8 ){
            System.out.println("Brackets work");

        }else{
            System.out.println("nilkal ");
        }

        // without brackets
        if (x < 0 && y == 7)
            System.out.println("chal !! gaya code ");
            else
                System.out.println("else ki placement dekh pehle");
        // chalo to fir else_if pai
        if (x ==0)
            System.out.println("inside if block");
        else if(true)
            System.out.println("mereko ea print kar-wana hai baba!!"); // please ignore my hindi written in english
        else
            System.out.println("nikal ea to kabhi nehi chalega!!"); // bhai ; kabhi mat bhulna nehi to compiler error marega tere upar 
            // always look out for ;
    }
}
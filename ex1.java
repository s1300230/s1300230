class Dice{
    public static void main(String[] args){
    
        double r1 = Math.random()*6+1;
        int a = (int)r1;
        
        double r2 = Math.ramdom()*6+1;
        int b =(int)r2;
        
        System.out.println("Die 1: "+a);
        System.out.println("Die 2: "+b);
        System.out.println("Total value: "+(a+b));
        
        //
        if((a+b)>=7){
            System.out.println("You won");
        }else{
            System.out.println("You lost");
        }
        //
    }
}

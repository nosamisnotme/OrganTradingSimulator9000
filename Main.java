import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static Time time = new Time();
    static Market market = new Market();
    static Human human = new Human();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int money = 10000;
        int hour = 0;
        String temp;
        int price = 0;
        System.out.println("");
        time.start();
        ArrayList<String[]> tests = new ArrayList<String[]>();
        String[] tempA = new String[7];
        tests.add(human.getOrgans(tempA));
        System.out.println("Your first subject.");
        boolean didOnce = false;
        while(true){
            hour = Time.getTick();
            if (hour == 1 && !didOnce){
                //clear
                //stockmarket
                System.out.println(market.genMarket());
                //System.out.println("test");
                didOnce = true;
            }
            else if(hour > 1) {
                didOnce = true;
                //genpage
                market.printMarket();
                System.out.println("(B)uy or (S)ell?");
                temp = sc.nextLine();
                temp = temp.toLowerCase();
                if (temp.equals("b")){
                    System.out.println("How many humans?($30000 per)");
                    temp = sc.nextLine();
                    if (money >= (Integer.parseInt(temp) * 30000)){
                        for (int i = 0; i < Integer.parseInt(temp); i++){
                            money -= 30000;
                            String[] tempA1 = new String[7];
                            tests.add(human.getOrgans(tempA1));
                        }
                        System.out.print(temp + " humans bought!");
                    }
                    else {
                        System.out.println("You don't have enough money!");                        
                    }
                }
                else if (temp.equals("s")){
                    System.out.println("What organ do you want to sell? (Kidney|Liver|Heart|Eyes|Skin|Spleen|Stomach)");
                    Boolean f = false;
                    for (int i = 0; i < tests.size(); i++){
                        System.out.print("Subject " + (i+1) + ": ");
                        for (String x : tests.get(i)){
                            System.out.print(x + "|");
                        }
                        System.out.println("");
                    }
                    temp = sc.nextLine();
                    temp = temp.toLowerCase();
                    if (temp.equals("kidney")){
                        price = market.getKidney();
                    }
                    else if (temp.equals("liver")){
                        price = market.getLiver();
                    }
                    else if (temp.equals("heart")){
                        price = market.getHeart();
                    }
                    else if (temp.equals("eyes")){
                        price = market.getEyes();
                    }
                    else if (temp.equals("skin")){
                        price = market.getSkin();
                    }
                    else if (temp.equals("spleen")){
                        price = market.getSpleen();
                    }
                    else if (temp.equals("stomach")){
                        price = market.getStomach();
                    }
                    else{
                        System.out.println("Organ does not exist!");
                    }
                    for (int i = 0; i < tests.size(); i++){
                        for (int x = 0; x < tests.get(i).length; x++){
                            if((tests.get(i)[x].toLowerCase().equals(temp))&&(f==false)){
                                money += price;
                                tests.get(i)[x] = "";
                                f = true;
                                System.out.println(temp.substring(0, 1).toUpperCase() + temp.substring(1) + " sold!");
                                System.out.println("+$" + price);
                                if (!human.isAlive(tests.get(i))){
                                    tests.remove(i);
                                    System.out.println("A subject died!");
                                }
                            }
                        }
                    }
                    f = false;
                }
            }
            try{Thread.sleep(2);}catch(Exception e){}
            time.read();
            time.clear();
        }
    }
}
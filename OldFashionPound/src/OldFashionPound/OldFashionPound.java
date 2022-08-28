package OldFashionPound;

import java.util.stream.Stream;

public class OldFashionPound {

    public OldFashionPound() {}

    public String sum(String x, String y) throws Exception {
        int sum = number(x) + number(y);
        return monetarySystem(sum);
    }

    public String subtraction(String x, String y) throws Exception{
        int subtraction = number(x) - number(y);
        return monetarySystem(subtraction);
    }

    public String multiply(String x, int y) throws Exception {
        int multiply = number(x) * y;
        return monetarySystem(multiply);
    }

    public String division(String x, int y) throws Exception {
        if (y!=0)   {
            int division = number(x) / y;
            int mod = number(x) % y;
            return monetarySystem(division) + "("+monetarySystem(mod)
                    .replaceAll("0p","").replaceAll("0s","")
                    .replaceAll("0d","").trim()+")";
        } else {
            //System.err.println("ERROR: division by 0 is an indeterminacy");
            throw new Exception("ERROR: division by 0 is an indeterminacy");
        }
    }

    private int number(String money) throws Exception {
        String regex = "^[0-9]+p[0-9]+s[0-9]+d$";
        money = money.replaceAll(" ","");
        if (money.matches(regex)) {
            String[] split = money.split("[a-z]");
            int p = Integer.parseInt(split[0]);
            int s = Integer.parseInt(split[1]);
            int d = Integer.parseInt(split[2]);
            return numberPense(p,s,d);
        } else {
            //System.err.println("ERROR: Bad input format (Xp Ys Zd) -> "+money);
            throw new Exception("ERROR: Bad input format (Xp Ys Zd) -> "+money);
        }
    }

    private int numberPense(int p, int s, int d) {
        return (p*20*12)+(s*12)+d;
    }

    private String monetarySystem(double num) {
        boolean negativo = false;
        if (num<0) {
            negativo = true;
            num = num * -1;
        }
        double pre_p =  ((num/12)/20);
        int p = (int) pre_p;
        double pre_s = (pre_p-p)*20;
        int s = (int) pre_s;
        int d = (int)  Math.round(((pre_s-s)*12));
        if(negativo) {
            return "- "+p+"p "+s+"s "+d+"d";
        }
        return p+"p "+s+"s "+d+"d";
    }
}

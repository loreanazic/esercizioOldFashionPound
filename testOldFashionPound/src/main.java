import OldFashionPound.OldFashionPound;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        OldFashionPound money = new OldFashionPound();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            System.out.println(money.sum("5p 17s 8d","3p 4s 10d"));
            System.out.println(money.subtraction("5p 17s 8d","17p 4s 10d"));
            System.out.println(money.multiply("5p 17s 8d", 2));
            System.out.println(money.division("5p 17s 8d", 3));
            System.out.println(money.division("18p 16s 1d", 15));
        */
            boolean end = false;
            while (!end) {
                try {
                    System.out.println("Sistema monetario inglese:");
                    System.out.println("---Menu---");
                    System.out.println("1. somma");
                    System.out.println("2. sottrazione:");
                    System.out.println("3. moltiplicazione:");
                    System.out.println("4. divisione");
                    System.out.println("5. fine del programma");
                    System.out.println("Inserisci un'opzione:");

                    int menu = Integer.parseInt(br.readLine());
                    switch(menu)
                    {
                        case 1:
                            System.out.println("---- Somma -----");
                            System.out.println("Primo input (Xp Ys Zd): ");
                            String x_sum = br.readLine();
                            System.out.println("Secondo input (Xp Ys Zd): ");
                            String y_sum = br.readLine();
                            System.out.println("Risultato "+x_sum+" + "+y_sum);
                            try {
                                System.out.println(money.sum(x_sum,y_sum));
                            } catch (Exception e) {
                                System.err.println(e.getMessage());
                            }
                            System.out.println("inserire una lettera qualsiasi per tornare al menu");
                            String return_menu_sum = br.readLine();
                            break;
                        case 2:
                            System.out.println("---- Sottrazione -----");
                            System.out.println("Primo input (Xp Ys Zd): ");
                            String x_sub = br.readLine();
                            System.out.println("Secondo input (Xp Ys Zd): ");
                            String y_sub = br.readLine();
                            System.out.println("Risultato "+x_sub+" - "+y_sub);
                            try {
                                System.out.println(money.subtraction(x_sub,y_sub));
                            } catch (Exception e) {
                                System.err.println(e.getMessage());
                            }
                            System.out.println("inserire una lettera qualsiasi per tornare al menu");
                            String return_menu_sub = br.readLine();
                            break;
                        case 3:
                            System.out.println("---- Moltiplicazione -----");
                            System.out.println("Primo input (Xp Ys Zd): ");
                            String x_mol = br.readLine();
                            System.out.println("Secondo input (un intero): ");
                            try {
                                int y_mol = Integer.parseInt(br.readLine());
                                System.out.println("Risultato "+x_mol+" * "+y_mol);
                                System.out.println(money.multiply(x_mol,y_mol));
                            } catch (Exception e) {
                                System.err.println(e.getMessage());
                            }
                            System.out.println("inserire una lettera qualsiasi per tornare al menu");
                            String return_menu_mol = br.readLine();
                            break;
                        case 4:
                            System.out.println("---- Divisione -----");
                            System.out.println("Primo input (Xp Ys Zd): ");
                            String x_div = br.readLine();
                            System.out.println("Secondo input (un intero): ");
                            try {
                                int y_div = Integer.parseInt(br.readLine());
                                System.out.println("Risultato "+x_div+" / "+y_div);
                                System.out.println(money.division(x_div,y_div));
                            } catch (Exception e) {
                                System.err.println(e.getMessage());
                            }
                            System.out.println("inserire una lettera qualsiasi per tornare al menu");
                            String return_menu_div = br.readLine();
                            break;
                        case 5:
                            end = true;
                            break;
                    }
                } catch(Exception e) {
                    System.err.println(e.getMessage());
                }
            }
    }
}

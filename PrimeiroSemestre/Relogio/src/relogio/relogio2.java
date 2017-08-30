package relogio;

import java.util.Scanner;

public class relogio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ah, am, as, ad = 0, d = 0;
        String semana="Dia Semana";
        boolean continuar = true;

        while (d <= ad) {
            System.out.println("Insira os dados do Alarme! \nPara o dia, informe número de 1 a 7 sendo 1 para Domingo, 2 para Segunda ...");
            System.out.println("Dia: ");
            ad = sc.nextInt();
            System.out.print("Hora: ");
            ah = sc.nextInt();
            System.out.print("Minutos: ");
            am = sc.nextInt();
            System.out.print("Segundos: ");
            as = sc.nextInt();
            for (d = 1; d <= 7; d++) {
                switch (ad) {
                    case 1:
                        semana = "Domingo";
                        break;
                    case 2:
                        semana = "Segunda";
                        break;
                    case 3:
                        semana = "Terça";
                        break;
                    case 4:
                        semana = "Quarta";
                        break;
                    case 5:
                        semana = "Quinta";
                    case 6:
                        semana = "Sexta";
                        break;
                    case 7:
                        semana = "Sábado";
                        break;
                }
                for (int h = 0; h <= 23; h++) {
                    for (int m = 0; m <= 59; m++) {
                        for (int s = 0; s <= 59; s++) {
                            System.out.printf("%d:%d:%d \n", h, m, s);
                            if (h == ah && m == am && s == as) {
                                System.out.printf("Alarme!!! \n\n%s %d:%d:%d\n\n", semana, h, m, s);
                                break;
                            }
                        }
                        if (h == ah && m == am && d == ad) {
                            break;
                        }
                    }
                    if (h == ah && d == ad) {
                        break;
                    }
                }
                if (d == ad) {
                    break;
                }
            }
            if (continuar) {
                if (d == ad) {
                    int cont;
                    System.out.println("Deseja continuar? 1 = SIM 0 = NÃO");
                    cont = sc.nextInt();
                    if (cont == 0) {
                        continuar = false;
                        break;
                    }

                }
            }
        }
    }
}

package contatelefonica;

import java.util.Scanner;

public class ContaTelefonica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double assinatura=23.32
                ,vlocal=0.09
                ,vddd=0.26
                ,vddi=0.86
                ,fatura;
        double local, ddd, ddi;
        
        System.out.println("Informe a quantidade de minutos em ligações locais:");
        local = leitor.nextDouble();
        
        System.out.println("Informe a quantidade de minutos em ligações Interurbanas:");
        ddd =leitor.nextDouble();
        
        System.out.println("Informe a quantidade de minutos em ligações internacionais:");
        ddi = leitor.nextDouble();
        
        local = local * vlocal;
        ddd = ddd * vddd;
        ddi = ddi * vddi;
        fatura = local + ddd + ddi;
        
        System.out.printf("Seu consumo em ligações locais foi de %.2f"
                + "\n O consumo em ligações DDD foi de %.2f"
                + "\n Em ligações DDI foi %.2f"
                + "\n O total da fatura é de %.2f \n", local, ddd, ddi, fatura);
        
    }
    
}

#include <stdio.h>
#include <math.h>

int main() {
    float aliquota = 0, salario = 0, deducao = 0, vliquido = 0, irpf= 0;
    printf("Insira o valor do salario bruto");
    scanf("%f", &salario);

        if(salario >= 4664.68){
            aliquota=2750/100;
            deducao=869.36;
            irpf=((salario*aliquota)-deducao);
}
    else if(salario >= 3751.06 ){
            aliquota=2250/100;
            deducao=636.13;
            irpf=((salario*aliquota)-deducao);
}
    else if(salario >= 2826.66){
            aliquota=1500/100;
            deducao=869.36;
            irpf=((salario*aliquota)-deducao);
}
    else if(salario >= 1903.98){
            aliquota=750/100;
            deducao=142.80;
            irpf=((salario*aliquota)-deducao);
}   
    else if(salario <= 1903.98){
            aliquota=0;
            deducao=0;
            irpf=((salario*aliquota)-deducao);
}   
    vliquido=(salario-irpf);
    printf("A aliquota sera de: %.2f\n",  aliquota);
    printf("A deducao sera de: %.2f\n", deducao);
    printf("O imposto sera de: %.2f\n", irpf);
    printf("Salario liquido sera de %.2f\n", vliquido);

return 0;
}


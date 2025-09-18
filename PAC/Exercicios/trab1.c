#include <stdio.h>
#include <math.h>

int main() {
    float vcompra, desconto, descontoap, vfinal;
    printf("Insira o valor de sua compra:");
    scanf("%f",&vcompra);

        if(vcompra>=600){
            desconto=(0.20);
            descontoap= (0.2*vcompra);
            vfinal=(vcompra-descontoap);
}
    else if(vcompra>=400 && vcompra<=599){
            desconto=(0.15);
            descontoap=(0.15*vcompra);
            vfinal=(vcompra-descontoap);
}
    else if(vcompra>=200){
            desconto=(0.10);
            descontoap=(0.10*vcompra);
            vfinal=(vcompra-descontoap);
}
    else if (vcompra<=199){
            printf("nao havera desconto, logo o preco sera mantido");
}
    printf("O desconto é:%.2f",desconto);
    printf("O valor do desconto aplicado é:%.2f",descontoap);
    printf("O valor final da compra é:%.2f",vfinal);

return 0;
}
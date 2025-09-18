#include <stdio.h>
#include <math.h>

int main()
{
    float nota1, nota2, media, pf, media2;
    printf("Insira a nota da prova 1: ");
    scanf("%f", &nota1);
    printf("Insira a nota da prova 2: ");
    scanf("%f", &nota2);
    media=((nota1+nota2)/2);

    if(media >=7 )
    {
        printf("Voce foi aprovado \n");
        printf("Sua media semestral foi de %f\n", &media);
    }
    else if(media <= 5)
    {
        printf("Voce ira para a prova final pois sua media foi %f \n", &media);
        printf("Agora insira a sua nota da prova final");
        scanf("%f",&pf);
        media2=((nota2+pf)/2);
        if(media2 >= 5)
        {
            printf("Parabens voce foi aprovado \n");
            printf("Sua media foi de %.2f",&media2);    
        }
        else
        {
            printf("Voce foi reprovado tente novamente no proximo semestre \n");
            printf("Sua media foi de %.2f \n",&media2);
        }
    }
    return 0;
}
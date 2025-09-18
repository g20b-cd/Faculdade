#include <math.h>
#include <stdio.h>

int anoBissexto(int ano)
{
    if((ano%4==0) && ((ano%100!=0) || (ano%400==0)))
    {
        return 1;   
    }
    else
    {   
        return 0;
    }
}
int main()
{ 
    int dia, mes, ano, valido=0;
    printf("Insira a data a ser analisada no seguinte formato\n data/mes/ano, exemplo: 25/12/2005");
    scanf("%d,%d,%d",&dia,&mes,&ano);
    if(mes==2)
    {   
        if (anoBissexto(ano) == 1)
        {   
            if(dia>=1 && dia<=29)
            {
                return 1;
            }
            else
            {
                printf("A data em questao e invalida");
            }
        }
    }
    else if(mes==4||mes==6||mes==9||mes==11)
    {
        if(dia>=1 && dia<=30)
        {
            valido=1;
        }
        else
        {
            valido = 0;
        }
    }    
    else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
    {
        if(dia>=1 && dia<=31)
        {
            valido = 1;
        }
        else
        {
            valido = 0;
        }       
    }
    if(valido==1)
    {
        printf("A data %d,%d,%d é valida",&dia,&mes,&ano);
    }
    else
    {
        printf("Sua data é invalida");
    }
return 0;
}








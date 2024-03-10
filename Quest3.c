/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include<stdlib.h>
#include<math.h>

void primo(int quant ,int number){
        int i, aux = 0;
   if(quant > 0 && number > 1){
        for(i = 1; i < number; i++){
            if(number%i == 0){
            aux ++;
            }
        }
        if(aux == 1){
            printf("%i ",number);
            primo(quant-1,number+1);
        }else{
            primo(quant,number+1);
        }
   }
   if(number == 1){
       printf("%i ",number);
       primo(quant-1,number+1);
   }
}

void fibonacci(int anterior ,int atual, int posicao ){
    int aux = 0;
        if(posicao >= 0){
            aux = atual;
            atual = anterior + atual;
            anterior = aux;
            
            printf("%d ",anterior);
        
            fibonacci(anterior,atual,posicao-1);
        }
        
    }
    
void quadrado(int quant, int number){
    if(quant > 0 && number > 0){
        printf("%d ",number*number);
        quadrado(quant-1,number+1);
    }
    if(number == 0){
        printf("%d ",number);
        quadrado(quant-1,number+1);
    }
}

void quadrado2(int quant){
    int i;
    for(i = 2; i <= quant; i+=2){
        printf("%d ", i*i);
    }
}

void cubo(int number){
    int i;
    for(i = 1; i <= number; i++){
        double result = pow(2,i);
        printf("%.0lf ", result);
    }
}

void sequencia(int posicao){
    
    int sequen[posicao];
    int i;
    
    sequen[0] = 2;
    sequen[1] = 10;
    sequen[2] = 12;
    sequen[3] = 16;
    sequen[4] = 17;
    sequen[5] = 18;
    sequen[6] = 19;
    
    for (i = 7; i < posicao; i++) {
        if (i % 3 == 1) {
            sequen[i] = sequen[i - 1] + 8;
        } else if (i % 3 == 2) {
            sequen[i] = sequen[i - 1] + 2;
        } else {
            sequen[i] = sequen[i - 1] + 4;
        }
    }
    
    for(i = 0; i < posicao; i++){
        printf("%d ",sequen[i]);
    }
}
int main() {
    // Write C code here
    printf("a) ");
    primo(6,1);
    printf("\nb) ");
    cubo(7);
    printf("\nc) ");
  quadrado(8,0);
  printf("\nd) ");
  quadrado2(10);
  printf("\ne) ");
  fibonacci(0,1,6);
  printf("\nf) ");
  sequencia(8);
  printf("\n");
    return 0;
}

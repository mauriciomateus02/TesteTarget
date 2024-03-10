#include <stdio.h>

void fibonacci(int anterior ,int atual,int value ){
    int aux = 0;
    
    if(atual == value){
        printf("pertence a sequencia fibonacci\n");
    }
    else if(atual > value){
        printf("nao pertece a sequencia fibonacci");
    }
    else{
        
        aux = atual;
        atual = anterior + atual;
        anterior = aux;
        
        fibonacci(anterior,atual,value);
    }
    
}

int main() {
    // Write C code here
  fibonacci(0,1,9);
    return 0;
}
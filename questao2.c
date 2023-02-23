#include <string.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    char entrada[30], copiaEntrada[30];               // variaveis para armazenar as palavras de entrada
    int i, caracteresIguais = 0, tamanhoPalavra, tam; // contador, quantidade de carateres iguais e variavel para armazenamento do tamanho da entrada

    scanf("%s", entrada);

    tamanhoPalavra = strlen(entrada);
    tam = strlen(entrada); // ARMAZENANDO O NUMERO DE CARACTERES EM tamanhoPalavra
    for (i = 0; i < tam; i++)
    {
        copiaEntrada[i] = entrada[tamanhoPalavra - 1]; // copiando o inverso da palavra em copiaEntrada

        tamanhoPalavra--;
    }

    tamanhoPalavra = strlen(entrada); // descobrindo o tamanho da palavra

    for (i = 0; i < tamanhoPalavra; i++)
    {
        if (entrada[i] == copiaEntrada[i])
        {
            caracteresIguais++;
        }
    }

    if (tamanhoPalavra == caracteresIguais)
    {
        printf("SIM");
    }
    else
    {
        printf("NAO");
    }

    return 0;
}
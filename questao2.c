#include <stdio.h>
#include <string.h>
#include <locale.h>
#include <ctype.h>

int main()
{
    setlocale(LC_ALL, "");
    int i, valor = 0;
    char entrada[30], copiaEntrada[15];

    scanf("%s", entrada);

    // Converter a entrada digitada para minúsculas
    for (i = 0; entrada[i]; i++)
    {
        entrada[i] = tolower(entrada[i]);
    }

    // Copiar a palavra digitada para que seja invertida
    strcpy(copiaEntrada, entrada);

    // Inverter a palavra copiada
    strrev(copiaEntrada);

    valor = strcmp(entrada, copiaEntrada);

    if (valor == 0)
        printf("SIM");
    else
        printf("NAO");

    return 0;
}
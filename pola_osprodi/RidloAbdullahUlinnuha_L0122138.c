#include <stdio.h>  //library standard input output
#include <stdlib.h>     //library untuk menggunakan exit(),

//Deklarasi fungsi
long int kombinasi();
long int permutasi();
long int variasi();
long int faktorial();

//MenuOperasi
char *menu[] =
{
    "Faktorial",
    "Kombinasi",
    "Permutasi",
    "Variasi",
    "Keluar",
};
//System menu menggunakan fungsi rekursif
int jumlahMenu = 5;
void printMenu(int index)
{
    if (index < jumlahMenu)
    {
        printf("%d. %s\n", (index+1), menu[index]);
        printMenu(index+1);
    }
}

//Keterangan Operasi terdapat di bawah
//Fungsi Main
int main()
{
    //deklarasi untuk string pada sprintf
    char combination[10], permutation[10], variation[10];

    //Mulai program
    printf("===Kalkulator Kombinatorika===\n");
    //deklarasi menu untuk menggunakan go to
    menu:
    printMenu(0);

    int n,k;
    int option;
    printf("Enter the number=>");
    scanf("%d", &option);

    switch (option)
    {
        case 1:
            printf("===FAKTORIAL [n!]===\n");
            printf("Masukkan Bilangan Bulat n: ");
            scanf("%d",&n);
            printf("Nilai %d! = %d\n\n", n, faktorial(n));
            goto menu;
            break;
        case 2:
            printf("===KOMBINASI [C(n, k)]===\n");
            printf("Masukkan Bilangan Bulat n: ");
            scanf("%d",&n);
            printf("Masukkan Bilangan Bulat k: ");
            scanf("%d",&k);

            if(n>=k)
            {
            //sprintf
            sprintf(combination,"C(%d, %d)", n, k);
            printf("Nilai Kombinasi %s = %ld\n\n", combination, kombinasi(n, k));
            goto menu;
            }else{
                printf("tidak terdefinisi karena n < k\n\n");
                goto menu;
            }
            break;
        case 3:
            printf("===Permutasi [P(n, k)]===\n");
            printf("Masukkan Bilangan Bulat n: ");
            scanf("%d",&n);
            printf("Masukkan Bilangan Bulat k: ");
            scanf("%d",&k);

            if(n>=k)
            {
            //sprintf
            sprintf(permutation,"K(%d, %d)", n, k);
            printf("Nilai Permutasi %s = %ld\n\n", permutation, permutasi(n, k));
            goto menu;
            }else{
                printf("tidak terdefinisi karena n < k\n\n");
                goto menu;
            }
            break;
        case 4:
            printf("===Variasi [V(n, k)]===\n");    //Variasi = C(n, k) * k!
            printf("Masukkan Bilangan Bulat n: ");
            scanf("%d",&n);
            printf("Masukkan Bilangan Bulat k: ");
            scanf("%d",&k);

            if(n>=k)
            {
            //sprintf
            sprintf(variation,"V(%d, %d)", n, k);
            printf("Nilai Variasi %s = %ld\n\n", variation, variasi(n, k));
            goto menu;
            }else{
                printf("tidak terdefinisi karena n > k\n\n");
                goto menu;
            }
            break;
        case 5:
            printf("\n---Exit Program---\n\n");
            exit(1);
            break;
        default:
            printf("Opsi salah\n");
            goto menu;
            break;
    }
    return 0;
}

//Faktorial menggunakan fungsi rekursif
//Faktorial = n! = n*(n-1)*(n-2)* ... *(1)
long int faktorial(int n) {
    if (n>=1)
        return n*faktorial(n-1);
    else
        return 1;
}

//Permutasi = (n!) / (n-k)!
long int permutasi(int n, int k){
    return faktorial(n) / faktorial(n-k);
}

//Kombinasi = (n!) / [(n-k)! * k!]
long int kombinasi(int n, int k){
    return faktorial(n) / ((faktorial(n-k))*faktorial(k));
}

//Variasi = C(n, k) * k!
long int variasi(int n, int k){
    return (kombinasi(n,k))+(faktorial(k));
}

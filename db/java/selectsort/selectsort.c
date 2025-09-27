/*
 * selectsort.c
 *
 *  Created on: 07-May-2025
 *      Author: Ai_CEC_04
 */




#include<stdio.h>
#include<stdlib.h>
#include <sys/time.h>
#include <time.h>

void fnGenRandInput(int [], int);
void fnDispArray(int [], int);
void fnSelectionSort(int [], int);
inline void fnSwap(int*, int*);

inline void fnSwap(int *a, int *b) {
int t = *a;
*a = *b;
*b = t;
}
int main() {
FILE *fp;
struct timeval tv;
double dStart, dEnd;
int iaArr[500000], iNum, i, iChoice;

for (;;) {
printf("\n1.Plot the Graph\n2.Selection Sort\n3.Exit");
printf("\nEnter your choice\n");
scanf("%d", &iChoice);

switch (iChoice) {
case 1:
printf("\nBefore file creation\n");
fp = fopen("SelectionPlot.dat", "w");
if (fp == NULL) {
perror("Error opening file SelectionPlot.dat");
printf("Error: Unable to create SelectionPlot.dat file for writing.\n");

}

exit(1);
printf("File created successfully\n");
printf("\nGenerating data...\n");
for (i = 100; i < 100000; i += 100) {
fnGenRandInput(iaArr, i);
gettimeofday(&tv, NULL);
dStart = tv.tv_sec + (tv.tv_usec / 1000000.0);
fnSelectionSort(iaArr, i);
gettimeofday(&tv, NULL);
dEnd = tv.tv_sec + (tv.tv_usec / 1000000.0);
fprintf(fp, "%d\t%lf\n", i, dEnd - dStart);
}
fclose(fp);
printf("\nData File generated and stored in file < SelectionPlot.dat >.\n Use a plotting utility\n");
break;
case 2:
printf("\nEnter the number of elements to sort\n");
scanf("%d", &iNum);
printf("\nUnsorted Array\n");
fnGenRandInput(iaArr, iNum);
fnDispArray(iaArr, iNum);
fnSelectionSort(iaArr, iNum);
printf("\nSorted Array\n");
fnDispArray(iaArr, iNum);
break;

case 3:
exit(0);
}
}
return 0;
}
void fnSelectionSort(int arr[], int n) {
int i, j, min_idx;
for (i = 0; i < n-1; i++) {
min_idx = i;
for (j = i+1; j < n; j++) {
if (arr[j] < arr[min_idx])
min_idx = j;
}
fnSwap(&arr[min_idx], &arr[i]);
}
}
void fnGenRandInput(int X[], int n) {
int i;
srand(time(NULL));
for (i = 0; i < n; i++) {
X[i] = rand() % 10000;
}
}
void fnDispArray(int X[], int n) {
int i;
for (i = 0; i < n; i++) {
printf(" %5d \n", X[i]);
}
}

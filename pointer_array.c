#include<stdio.h>
int main()
{
int n;

printf("Enter the value of n ");
scanf("%d",&n);

int arr[n];
int *ptr = arr;

printf("Enter the elements of array: \n");
for(int i=0;i<n;i++)
{
scanf("%d",ptr+i);
}
printf("The Elements of the array are:\n");
for(int i=0;i<n;i++)
{
printf("%d \t",*(ptr+i));
}
printf("\n");
return 0;
}

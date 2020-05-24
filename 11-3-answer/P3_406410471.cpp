// ID: 406410471,name:³¢¬ü­§,class: 1B 
#include <stdio.h>
#include <stdlib.h>
void tower(int n, int to, int aux, int from){
	if(n==1){
		printf("%d -> %d\n", from, to);
	}else{
		tower(n-1, aux, to, from);
		printf("%d -> %d\n", from, to);
		tower(n-1, to, from, aux);
	}
	
}
int main(void){
	int n;
	printf("Enter n: ");
	scanf("%d", &n);
	tower(n,1,2,3);
	return 0;
}


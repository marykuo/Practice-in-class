// ID: 406410471,name:³¢¬ü­§,class: 1B 
#include <stdio.h>

int main(void){
	int hour=0,min=0;
	long sec=0;
	while(1){
		printf("hours: ");
		scanf("%d", &hour);
		printf("minutes: ");
		scanf("%d", &min);
		printf("seconds: ");
		scanf("%d", &sec);
		if(hour==-1 && min==-1 && sec==-1){
			printf("Exit\n");
			break;
		}
		sec+=3600*hour+60*min;
		printf("total %d seconds\n\n",sec);
		
	}
	return 0;
}


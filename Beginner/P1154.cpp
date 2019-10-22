#include<stdio.h>

main()
{
	int n;
	float sum=0,div=0;
	while(1){
		scanf("%d",&n);
		if(n<0) break;
		sum+=n;
		div+=1;
	}
	float m = (sum/div);
	printf("%.2f\n",m);
}

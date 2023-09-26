#include<stdio.h> voidfindWaitingTime(int processes[],
int n,int bt[], int wt[])
{ wt[0] = 0; 
for(int i = 1; i< n ; i++ ) wt[i]
= bt[i-1] + wt[i-1] ;
}
voidfindTurnAroundTime( intprocesses[], intn,intbt[], intwt[], inttat[])
{ 
    for(int i = 0; i <n ;i++) tat[i] = bt[i] +
wt[i];
}
voidfindavgTime( intprocesses[], intn, intbt[])
{
intwt[n], tat[n], total_wt = 0, total_tat = 0;
findWaitingTime(processes, n, bt, wt);
findTurnAroundTime(processes, n, bt, wt, tat); 
printf("Processes Burst time Waiting time Turn around time\n"); 
for(int i=0; i<n;i++)
{
    total_wt = total_wt + wt[i];
total_tat = total_tat + tat[i];
printf(" %d ",(i+1)); 
printf("%d ", bt[i] ); 
printf("%d",wt[i] ); 
printf("%d\n",tat[i] );
}
ints=(float)total_wt / (float)n;
intt=(float)total_tat / (float)n;
printf("Average waiting time = %d",s);
printf("\n");
printf("Average turn around time = %d",t);
}
intmain()
{
intprocesses[] = { 1, 2, 3}; 
intn =sizeofprocesses / sizeofprocesses[0]; int
burst_time[] = {10, 5, 8};
findavgTime(processes, n, burst_time);
return0;
}
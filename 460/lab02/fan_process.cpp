#include <iostream>
#include <unistd.h>
#include <sys/wait.h>
using namespace std;

int main()
{
   int pid;
   int parent = getpid();

   cout << "\n\t\t\tParent id is: " << parent << endl;
   pid = fork();

   for (int i=0; i < 10; ++i) 
   {
       if (pid > 0) {
           pid = fork(); 

	   if(pid == 0) 
	   {
           cout << "This is a child process: " << getpid() 
		   << ", and the parent ID is: " << getppid() << endl;
           }

	   else
           {          
           wait(0);
	   }
       }
    }  
}

#include <iostream>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stack>

using namespace std;

int main()
{

int num = 10;

pid_t chid;

stack<pid_t> ancestors;        
for (int i1 = 0; i1 < num; ++i1) 
{
    if ( chid == fork() )
     {
        break;       
     }
    ancestors.push(getppid()); 
}

wait ( NULL );   

cout << "process " << getpid() << " with child " << chid <<  " and ancestors: ";
while ( !ancestors.empty() ) 
{ 
    cout << ancestors.top() << " ";
    ancestors.pop();             
}
cout << endl;

return 0;
}

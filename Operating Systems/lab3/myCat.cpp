#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {

    //check that there are three arguments when exceuting
    if (argc != 3) {
        cout << "not enough arguments\n";
        exit(1);
    }
    int status;
    //create a process
    pid_t cid;
    cid = fork();
    //Child process
    if (cid == 0) {
        cout << "In the Child Process trying to meow\n";
        //return the child id along with the parent and process group id
        cout << "Child Process ID: " << getpid() << 
             ", Parent Process ID: " << getppid() <<
             ", Process Group Id: " << getpgrp() << endl;
        //then execute the cat command with option -n for argument[1] and [2]
        execl("/bin/cat", "cat", "-n", argv[1], "-", argv[2], NULL);
        cout << "Error\n";

    }
    //Parent Process
    else if (cid > 0) {
        wait(&status);
        cout << "In the Parent Process\n";
        cout << "Child Process ID: " << getpid() << ", "
        ", Parent Process ID: " << getppid() <<
        ", Process Group Id: " << getpgrp() << endl;
    }

    else {
        cout << "Error Forking\n";
    }



}

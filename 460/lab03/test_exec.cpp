//test_exec.cpp
//
#include <unistd.h>
#include <iostream>

using namespace std;

int main()
{
	cout << "\nRunning ps with exexlp\n";
	execlp ("ps", "ps", "-ax", 0);

	cout << "Done\n";
	return 0;
}

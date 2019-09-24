#include<iostream>

#include <curses.h> 

#include<math.h>

using namespace std;

int row1;
int row2;
int col1;
int col2;

void *multiply(void *);

int main() {

pthread_t;

int i,j,k;

int A[][];

int B[][];

cout<<"A: Enter rows & columns - >";

cin >> row1;

cin >> col1;

cout <<"B: Enter rows and columns ->";

cin >> row2;

cin >> col2;

cout<<"Enter matrix 1 : ";

for (i=0;i<row1;i++)

{

for (j=0;j<col1;j++)

	cin >> A[i][j];

}

cout<<"enter matrix 2";

for (i=0; i<row2; i++) {

	for (j=0; j<col2; j++) {

		cin >> A[i][j];
	}
}

if (col1 != row2) {

	cout<<"Matrix multiplication is not possible";
}

else {

	for(i=0; i<row1; i=1+2)

	{

		for(j=0; j< col2; j=j+2) {
			int C[i][j]=0;
		}
	}

}

pthread_form(&t, NULL, multiply, NULL);

for (i=0; i<row1; i=i+ 2) {

	for(j=0; j<col2; j++) {

		for(k=0; k<col1; k++) {
			C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
		}
	}
}

pthread_join(t,NULL);

cout<<"resultant matrix is:";

for (i=0; i<row1; i++) {
	for (j=0; j<col2; j++) {
		cout << C[i][j];
	}
	cout << endl;
}
	return 0;
}

void *multiply( void *p) {

int i, j, k;

for (i=0; i<row1; i=i+2) {
	for (j=0; j<col2; j++) {
		for (k=0; k<col1; k++) {
			C[i][j] = C[i][j] + ( A[i][k] * B[k][j]);
		}
	}
}


cout << "thread finished";

pthread_exit(NULL);

}

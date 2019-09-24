/*#include <bits/stdc++.h>

using namespace std;

void createMap(unordered_map<string, char> *um) {

  (*um) ["0000"] = '0';
  (*um) ["0001"] = '1';
  (*um) ["0010"] = '2';
  (*um) ["0011"] = '3';
  (*um) ["0100"] = '4';
  (*um) ["0101"] = '5';
  (*um) ["0110"] = '6';
  (*um) ["0111"] = '7';
  (*um) ["1000"] = '8';
  (*um) ["1001"] = '9';
  (*um) ["1010"] = 'A';
  (*um) ["1011"] = 'B';
  (*um) ["1100"] = 'C';
  (*um) ["1101"] = 'D';
  (*um) ["1110"] = 'E';
  (*um) ["1111"] = 'F';
}

string convertBin2Hex(string bin) {

  int l = bin.size();
  int t = bin.find_first_of('.');

  int len_left = t != -1 ? t : 1;

  for(int i =1; i <= (4 -len_left % 4) % 4; i++)
    bin = '0' + bin;

  if (t != -1) {

    int len_right = 1 - len_left - 1;

    for (int i = 1; i <= (4 - len_right % 4) % 4; i ++)
      bin = bin + '0';
  }

 unordered_map<string, char> bin_hex_map;
 createMap(&bin_hex_map);

 int i = 0;
 string hex = "";

while (1) {

  hex += bin_hex_map[bin.substr(i, 4)];
  i += 4;
  if (i == bin.size()) { break; }

  if (bin.at(i) == '.') {
    hex += '.';
    i++;
  }
 }
 return hex;
}

int main () {

  string bin;

  cout << "Input a Binary number to change to Hexadecimal\n";

  cin bin;

  cout << "Hexadecimal number = " << convertBin2Hex(bin);

  return 0;
}
*/

#include <iostream>

using namespace std;

int mian() {

  int hex[1000];
  int i = 1;
  int j = 0;
  int rem;
  int dec = 0;
  int bin;

  cout << "\n\n Convert a binary number to a hexadecimal number\n";
  cout << "----------------------------------------------------\n";
  cout << " Input a binary number\n";

  cin >> bin;

  while (bin > 0) {

    rem = bin % 2;
    dec = dec + rem * i;
    i = i * 2;
    bin = bin / 10;
  }
  i = 0;
  while (dec != 0) {

    hex[i] = dec % 16;
    dec = dec / 16;
    i++;
  }

  cout << " The hexadeimal value: ";
  for (j = i -1; j >= 0; j--) {

    if (hex[j] > 9) { cout << (char)(hex[j] + 55) << "\n"; }

    else { cout << hex[j] << endl; }
  }
  return 0;
}

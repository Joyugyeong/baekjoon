#include <iostream>
#include <string>
using namespace std;
int main(void)
{
	string s;
	cin >> s;
	for (char a = 'a'; a <= 'z'; a++)
	{
		int index = s.find(a);
		cout << index << " ";
	}
	
	
}
//��� ���� ��������
#include<iostream>
#include<string>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string s;
	cin >> s;

	int idx = s.length() / 2;

	if (s.length() % 2 == 0)	//���ڿ��� ���̰� ¦���� ��
		cout << s.substr(idx-1, 2);
	else
		cout << s[idx];

	return 0;
}
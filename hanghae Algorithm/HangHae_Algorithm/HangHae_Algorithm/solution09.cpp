//�ڵ��� ��ȣ ������
#include<iostream>
#include<string>
using namespace std;

char arr[100001];

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string s;
	cin >> s;	//01033334444

	int size = s.length();

	for (int i = 0; i < size; i++)
		arr[i] = s[i];

	int tmp = size - 4; //��ǥ���� �� �ʿ�

	for (int i = 0; i < size; i++)
	{
		if (i < tmp)
			arr[i] = '*';
		cout << arr[i];
	}
	return 0;
}

/*
#include <string>
#include <vector>

using namespace std;
char arr[100001];
string solution(string phone_number) {
	string answer = "";
	int size = phone_number.length();

	for (int i = 0; i < size; i++)
		arr[i] = phone_number[i];

	int tmp = size - 4; //��ǥ���� �� �ʿ�

	for (int i = 0; i < size; i++)
	{
		if (i < tmp)
			arr[i] = '*';
		answer += arr[i];
	}
	return answer;
}
*/
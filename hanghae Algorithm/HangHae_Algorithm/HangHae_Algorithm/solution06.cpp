//���� ���� ���ϱ�
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<int>vec(9);

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int sum = 0, tmp = 45;

	for (int i = 0; i < vec.size(); i++)	//��� �Է��� �� ������Ѵ�. 0���ζ�
	{
		cin >> vec[i];
		sum += vec[i];
	}

	cout << tmp - sum;
	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
	int answer = 45;
	for (int i=0; i < numbers.size(); i++)
		answer-= numbers[i];
	return answer;
}
*/
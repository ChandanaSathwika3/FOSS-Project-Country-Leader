# COUNTRY LEADER

M1 – Pavan Polabathula<br />
M2 – Sameer Shaik<br />
M3 – Yogesh Patel<br />
M4 – Chandana Sathwika<br />
M5 – Michael Bekele Yali<br />

# Problem:

The Constitution of a certain country states that the leader is the person with the name containing the greatest number of different alphabet letters. (The country uses the uppercase English alphabet from A through Z.) For example, the name GOOGLE has four different alphabet letters: E, G, L, and O. The name APAC CODE JAM has eight different letters. If the country only consists of these 2 persons, APAC CODE JAM would be the leader.
If there is a tie, the person whose name comes earliest in alphabetical order is the leader.

## Input

The first line of the input gives the number of test cases, T. T test cases follow. Each test case starts with a line with an interger N, the number of people in the country. Then N lines follow. The i-th line represents the name of the i- th person. Each name contains at most 20 characters and contains at least one alphabet letter

## Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the name of the leader.

## Sample Input

2<br />
3<br />
ADAM<br />
BOB<br />
JOHNSON<br />
2<br />
A AB C<br />
DEF<br />

## Sample Output

Case #1: JOHNSON<br />
Case #2: A AB C<br /><br />
In Sample Case #1,<br /> JOHNSONcontains 5 different alphabet letters('H', 'J', 'N', 'O', 'S'), so he is the leader.<br /><br />
In Sample Case #2,<br /> The nameDEFcontains 3 different alphabet letters, the nameA AB Calso contains 3 different alphabet letters.A AB Ccomes alphabetically earlier so he is the leader.

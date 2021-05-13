#include <stdio.h>
#include<stdint.h>
//uint8_t x;
char x;
  //biến toàn cục không cần khởi tạo giá trị ban đầu
void main() {
	x =0x0a;
	x= 0b1010;
	x= 'a';
	x = 10; //biến cục bô phải khởi tạo giá trị ban đầu

	printf(x);
}

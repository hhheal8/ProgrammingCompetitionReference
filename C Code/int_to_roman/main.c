#include <stdio.h>
#include <stdlib.h>

char *int_to_roman(int n) {

  char *ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
  char *tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
  char *hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
  char *thousands[] = {"", "M", "MM", "MMM"};

  char *roman_numeral = malloc(16 * sizeof(char));

  sprintf(roman_numeral, "%s%s%s%s", thousands[n / 1000], hundreds[(n % 1000) / 100], tens[(n % 100) / 10], ones[n % 10]);

  return roman_numeral;

}


int main() {

  printf("%s\n", int_to_roman(2023));

  return 0;

}
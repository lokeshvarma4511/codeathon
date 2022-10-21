package company.codeathon;

import company.dsa.LengthOfInteger;

import java.util.Scanner;

public class PalindromeNumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("enter number:");
        int n = sc.nextInt();
        palindrome(n);
    }
    static int count1 = 0, count2 = 0;
    public static void palindrome(int n)
    {
        for(int i=0; i<n+1;i++ ) {
            int sum = 0, rem = 0, k = i;
            while (k > 0) {
                rem = k % 10;
                sum = sum * 10 + rem;
                k = k / 10;
            }
            if (sum == i) {
                count1 += 1;
            }
        }
        int sq=0;
        for(int i=0;i<n/2;i++)
        {
            if(i*i <=n)
            {
                count2+=1;
            }
        }
        System.out.println(( count1-1));
        System.out.println(count2-1);
    }
}
/*2753번 윤년
*문제
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.

입력
첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.

출력
첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

예제 입력 1
2000
예제 출력 1
1
예제 입력 2
1999
예제 출력 2
0
*
* */

package level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step02_3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int year = Integer.parseInt(br.readLine());
            br.close();

            if(year%4==0){
                if(year%100!=0){
                    System.out.println(1);
                }
                else if(year%400==0){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else{
                System.out.println(0);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 /*처음에 문제를 이해하는데 시간이 좀 오래걸렸다. 윤년의 조건부분이 이해가 가지않았다;
예제를 다시 읽어도 모르겠어서 결국 종이에 플로우차트를 그리면서 겨우 이해했던거같다..
결론: if-else문과 if-else if-else 문을 적절히 사용해야한다.
잊고있던 BufferedReader를 사용해보았다
*/
package algorithm;

import com.sun.tools.javac.Main;

import java.util.Arrays;
class CodeStudy3 {
    public  static void main(String[] args) {
        Solution28 method = new Solution28();
        System.out.println(method.solution(11));

    }
}

//이상한 문자 만들기
class Solution21 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int a = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i].equals(" ")){
                a = 0;

            }else if(a % 2 == 0){
                arr[i] = arr[i].toUpperCase();
                a ++;
            }else{
                arr[i] = arr[i].toLowerCase();
                a++;
            }
            answer += arr[i];
        }
        return answer;
    }
}

//자릿수 더하기
class Solution22 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
//자연수 뒤집기
class Solution23 {
    public int[] solution(long n) {
        String a = n +"";
        int[] answer = new int[a.length()];
        for(int i = 0; n > 0; i++){
            answer[i] += (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}

//내림차순으로 배치하기
class Solution24 {
    public long solution(long n) {
        String str = n +"";
        String ans = "";
        char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        for(int i = arr.length -1; i >=0; i--){
            ans += arr[i];
        }
        return Long.parseLong(ans);
    }
}

//정수 제곱근 판별
class Solution25 {
    public long solution(long n) {
        long answer = 0;
        for(int i =0; i *i <=n;i++){
            if(i *i ==n){
                answer = (i+1) * (i+1);
            }
        }
        return answer == 0? -1:answer;
    }
}

//제일 작은 수 제거하기
class Solution26 {
    public int[] solution(int[] arr) {
        if(arr.length ==1){
            int[] answer ={-1};
            return answer;
        }
        int[] answer = new int[arr.length - 1];
        int m = arr[0];
        for (int i = 0; i < arr.length;i++){
            m = Math.min(m,arr[i]);
        }
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==m){
                continue;
            }
            answer[a++] = arr[i];
        }
        return answer;
    }
}
class Solution27 {
    public int solution(int n) {
        int answer = 0;
        long num = n;
        while (num != 1){
            if (num % 2 ==0){
                num /= 2;
            }else {
                num = 3 * num +1;
            }answer++;
            if (answer > 500){
                return -1;
            }
        }
        return answer;
    }
}

//하샤드 수
class Solution28 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;
        while(a > 0){
            sum += a%10;
            a /= 10;
        }
        if(x % sum == 0){
            return true;
        }else{
            return false;
        }
    }
}

